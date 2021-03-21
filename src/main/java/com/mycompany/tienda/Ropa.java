/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Alumno 3
 */
public final class Ropa extends Articulo implements Reciclable{

    String color;
    TallaSML talla;
    int reciclada=0;

    public Ropa() {
    }

    public Ropa(String color, TallaSML talla,int reciclada, String codigo, String nombre, float precio, int stock) {
        super(codigo, nombre, precio, stock);
        this.color = color;
        this.talla = talla;
        this.reciclada=reciclada;
        
    }

    

    @Override
    public String toString() {
        return super.toString() + "Color: " + this.color + "\nTalla: " + this.talla +"Reciclada:"+this.reciclada+ "\n";
    }

    @Override
    public void applyPromo(String codigopromo) {
        //si el codigo promocial es ropapromo se aplica un 20% en el precio

        if (codigopromo.equals("ropapromo")) {
            this.setPrecio(((float) this.getPrecio() * 0.8));

        }
    }

    @Override
    public boolean esReciclable() {
       
        if(reciclada>0&&reciclada<=2)
            return true;
        else
          return false;
       
    }
        
        

    @Override
    public void applyDiscount() {
        if(this.esReciclable()==true){
            System.out.println("valor reciclada"+this.reciclada);
            if(this.reciclada==1)
                this.setPrecio(((float) this.getPrecio() * 0.5));
            /*else 
                this.setPrecio(((float) this.getPrecio() * 0.5));*/
        }
    }
        
        

   
    
        
        
}
