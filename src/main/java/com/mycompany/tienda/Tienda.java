/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno 3
 */
public class Tienda {

    /**
     * metodo principal que crea un catalog de articulos ofrece un menú con 6
     * opciones, alta, compra, confirmacion alta usuario,opinion articulo,
     * visualizar opinion
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner cadenas = new Scanner(System.in);

        int opcion = -1;
        Usuario user = new Usuario();

        ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
        inicializaCatalogo(catalogo);

        Carrito cesta = new Carrito();

        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Alta Articulo");
            System.out.println("2. Comprar");
            System.out.println("3. Confirmar compra");
            System.out.println("4. Crear Usuario");
            System.out.println("5. Dar opinion de un articulo");
            System.out.println("6. Mostrar opiniones de un articulo");

            System.out.println("0. Salir");
            opcion = numeros.nextInt();

            switch (opcion) {
                case 1:
                    addArticuloCatalogo(catalogo, cadenas, numeros);
                    mostrarCatalogo(catalogo);
                    break;
                case 2:
                    comprar(catalogo, cesta, cadenas, numeros);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    darOpinion(user, catalogo, cadenas, numeros);
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Muchas gracias por su compra.");
                    break;
                default:
                    System.out.println("Opcion incorrecta, lea atentamente.");
                    break;
            }
        } while (opcion != 0);

    }

    /**
     * este metodo crea un catalogo con 4 artículos
     *
     * @param c
     */
    private static void inicializaCatalogo(ArrayList<Articulo> c) {
        c.add(new Electrodomestico(Clasificacion_energetica.A, "informatica", "0001", "Monitor", 200.00F, 10));
        c.add(new Electrodomestico(Clasificacion_energetica.A, "informatica", "0002", "Teclado", 10.00F, 100));
        c.add(new Electrodomestico(Clasificacion_energetica.A, "Informatica", "0003", "RJ45 2M", 4.50F, 50));
        c.add(new Electrodomestico(Clasificacion_energetica.A, "Informatica", "0004", "Raton", 20.00F, 15));
        c.add(new Ropa("rojo", TallaSML.L,0, "0005", "Jersey", 25.00F, 100));
        c.add(new Electrodomestico(Clasificacion_energetica.A, "Hogar", "0006", "Lavadora", 526.98F, 10));
        c.add(new placas_cocina(construccion.encastrable, control.electronico, material.acero, Clasificacion_energetica.A, "hogar", "0007", "placa cocina", 330.00F, 45));
    }

    /**
     * añade un articulo a catalogo con los datos introducidos por usuario
     *
     * @param c
     * @param sc
     * @param sn
     */
    private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner sc, Scanner sn) {
        System.out.println("Introduce el codigo del nuevo articulo:");
        String codigo = sc.nextLine();
        System.out.println("Introduce el nombre del nuevo articulo:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio del nuevo articulo:");
        float precio = sn.nextFloat();
        System.out.println("Introduce el stock del nuevo articulo:");
        int stock = sn.nextInt();
        System.out.println("Introduce EL COLOR del nuevo articulo:");
        String color = sn.nextLine();
        System.out.println("Introduce la talla del nuevo articulo:");
        char talla=sc.nextLine().charAt(0);
        TallaSML t=TallaSML.S;
        if(talla=='M')
            t=TallaSML.M;
         if(talla=='l')
            t=TallaSML.L;
          if(talla=='X')
            t=TallaSML.XL;
        c.add(new Ropa(color,t,0,codigo, nombre, precio, stock));
    }

    /**
     * muestra todos los articulos de un catalogo
     *
     * @param c
     */
    private static void mostrarCatalogo(ArrayList<Articulo> c) {
        for (Articulo a : c) {
            System.out.println(a);
        }
    }

    /**
     * metodo que dado un catalogo y un codigo devuelve el articulo con for
     * avanzado
     *
     * @param c
     * @param codigo
     * @return articulo si lo encuentra o null si no lo encuentra
     */
    private static Articulo buscarArticuloPorCodigo1(ArrayList<Articulo> c, String codigo) {

        for (Articulo a : c) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }

        return null;

    }

    /**
     * metodo que dado un catalogo y un codigo devuelve el articulo con for
     *
     * @param c
     * @param codigo
     * @return articulo si lo encuentra o null si no lo encuentra
     */
    private static Articulo buscarArticuloPorCodigo2(ArrayList<Articulo> c, String codigo) {
        int talla_catalogo = c.size();

        for (int i = 0; i < talla_catalogo; i++) {
            if (c.get(i).getCodigo().equals(codigo)) {
                return c.get(i);
            }
        }

        return null;

    }

    /**
     * metodo que dado un catalogo y un codigo devuelve el articulo con while
     *
     * @param c
     * @param codigo
     * @return articulo si lo encuentra o null si no lo encuentra
     */
    private static Articulo buscarArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
        int talla_catalogo = c.size();
        int i = 0;
        Articulo a = null;
        boolean found = false;

        while (i < talla_catalogo && !(found)) {
            if (c.get(i).getCodigo().equals(codigo)) {
                a = c.get(i);
                found = true;
            } else {
                i++;
            }
        }

        return a;

    }

    /**
     * metodo que dado un catalogo y un codigo devuelve la posicion del articulo
     * en el catalogo se recorre con un while
     *
     * @param c
     * @param codigo
     * @return
     */
    private static int buscarPosicionArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
        int talla_catalogo = c.size();
        int i = 0;
        boolean found = false;

        while (i < talla_catalogo && !(found)) {
            if (c.get(i).getCodigo().equals(codigo)) {
                found = true;
            } else {
                i++;
            }
        }
        if (found) {
            return i;
        } else {
            return -1;
        }

    }

    /**
     * metodo que se le pasa un catalogo y un carrito, y permite que se compre
     * un articulo por codigo, comprobando si hay stock suficiente
     *
     * @param c
     * @param carro
     * @param sc
     * @param sn
     */
    private static void comprar(ArrayList<Articulo> c, Carrito carro, Scanner sc, Scanner sn) {
        int salircomprar = -1;
        do {

            mostrarCatalogo(c);
            System.out.println("Elige un articulo e introduce su codigo: ");
            String codigo = sc.nextLine();
            Articulo a = buscarArticuloPorCodigo(c, codigo);
            if (a != null) {
                System.out.println("Indica la cantidad que quieres: ");
                int cantidad = sn.nextInt();
                //Si no tengo suficiente hare lo mismo que si no hubiera encontrado el articulo
                if (a.disponible(cantidad)) {
                    carro.addArticulo(a, cantidad);
                } else {
                    System.out.println("Articulo no disponible, elija otro o revise la cantidad elegida.");
                }
            } else {
                System.out.println("Articulo no disponible, elija otro o revise la cantidad elegida.");
            }

            System.out.println(carro.mostrarCarrito());

            System.out.println("Pulsa 0 si quieres salir de comprar e ir a confirmar. "
                    + "Cualquier otra tecla para seguir comprando.");
            salircomprar = sn.nextInt();

        } while (salircomprar != 0);

    }

    /**
     * metodo que pasado un catalogo y un carrito actualiza el stock del
     * catalogo
     *
     * @param c
     * @param carro
     */
    private static void modificarStockCatalogo(ArrayList<Articulo> c, Carrito carro) {
        int pos;
        for (ArticuloCarrito ac : carro.pedido) {
            pos = buscarPosicionArticuloPorCodigo(c, ac.elemento.getCodigo());
            if (pos > -1) {
                c.get(pos).ajustarStock(-1 * ac.cantidad);
            }
        }
    }

    /**
     * metodo que confirma un carrito, permite seguir comprando
     *
     * @param c
     * @param carro
     * @param sn
     */
    private static void confirmarCarrito(ArrayList<Articulo> c, Carrito carro, Scanner sn) {
        //Mostramos carrito articulos+cantidades+ el total y estado
        System.out.println(carro.mostrarCarrito());
        System.out.println("Pulsa 1 si quieres confirmar la compra del carrito. Cualquier otra tecla para seguir comprando.");
        int confirmar = sn.nextInt();
        if (confirmar == 1) {
            modificarStockCatalogo(c, carro);
            carro.confirmado = Carrito.CONFIRMADO;
            System.out.println(carro.mostrarCarrito());
            mostrarCatalogo(c);
            System.out.println("Gracias por su compra. Puede continuar comprando.");
            carro = new Carrito();
        } else {
            System.out.println("Puede continuar comprando.");
        }
        //Preguntamos confirmacion
        // Si se confirma
        // 		Modificar en el catalogo el stock de los articulos del carrito, restando
        // 		las cantidades al stock
        //		Cambiar estado carrito a confirmado
        //		Mostramos carrito articulos+cantidades+ el total y estado
        //		Mostramos catalogo con el nuevo stock
        //		Mostramos mensaje de despedida y salimos del programa
        //Si no se confirma: Mostramos mensaje de que puede seguir comprando
    }

    /**
     * metodo que permite dar opinion, busca el articulo por codigo y si lo
     * encuentra crea una opinion, muestra el articulo y la opinion
     *
     * @param us
     * @param c
     * @param sc
     * @param sn
     */
    private static void darOpinion(Usuario us, ArrayList<Articulo> c, Scanner sc, Scanner sn) {
        mostrarCatalogo(c);
        System.out.println("Elige un articulo e introduce su codigo: ");
        String codigo = sc.nextLine();
        Articulo a = buscarArticuloPorCodigo(c, codigo);
        if (a != null) {
            crearOpinion(us, a, sc, sn);
            System.out.println(a);
            System.out.println(a.showOpinions());

        } else {
            System.out.println("Articulo no disponible, elija otro");
        }

    }

    /**
     * metodo que permite crear opinion, dado un articulo lo puntua
     *
     * @param us
     * @param a
     * @param sn
     * @param sc
     */
    private static void crearOpinion(Usuario us, Articulo a, Scanner sn, Scanner sc) {
        System.out.println("Valora del 1 al 1 este articulo,1:horrible, 2:malo, 3:normal, 4:bueno, 5 :perfecto");
        int puntos1 = sn.nextInt();
        punt puntos = punt.perfecto;
        if (puntos1 == 1) {
            puntos = punt.horrible;
        }
        if (puntos1 == 2) {
            puntos = punt.malo;
        }
        if (puntos1 == 3) {
            puntos = punt.normal;
        }
        if (puntos1 == 4) {
            puntos = punt.bueno;
        }
        if (puntos1 == 5) {
            puntos = punt.perfecto;
        }

        System.out.println("Escribe un comentario breve");
        String comment = sc.nextLine();
        a.AddOpinion(new Opinion(us, puntos, comment));
    }

}
