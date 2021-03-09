package com.mycompany.tienda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno 3
 */
public class Electrodomestico extends Articulo {
    private Clasificacion_energetica Clasificacion_energetica;
    private String gama;

    public Electrodomestico() {}

    public Electrodomestico(Clasificacion_energetica Clasificacion_energetica, String gama, String codigo, String nombre, float precio, int stock) {
        super(codigo, nombre, precio, stock);
        this.Clasificacion_energetica = Clasificacion_energetica;
        this.gama = gama;
    }
  

    /**
     * @return the Clasificacion_energetica
     */
    public Clasificacion_energetica getClasificacion_energetica() {
        return Clasificacion_energetica;
    }

    /**
     * @param Clasificacion_energetica the Clasificacion_energetica to set
     */
    public void setClasificacion_energetica(Clasificacion_energetica Clasificacion_energetica) {
        this.Clasificacion_energetica = Clasificacion_energetica;
    }

    /**
     * @return the gama
     */
    public String getGama() {
        return gama;
    }

    /**
     * @param gama the gama to set
     */
    public void setGama(String gama) {
        this.gama = gama;
    }
     @Override
    public String toString(){
      return super.toString() + "Clasificacion energetica: " + this.Clasificacion_energetica + "\nGama: " +this.gama+ "\n" ;
    }
    
}
