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
public class Ropa extends Articulo{
    String color;
    TallaSML talla;
    public Ropa(){}
    
    public Ropa(String color, TallaSML talla,String codigo,String nombre,float precio,int stock){
    super(codigo,nombre,precio,stock);
    this.color=color;
    this.talla=talla;
    }
    
    @Override
    public String toString(){
      return super.toString() + "Color: " + this.color + "\nTalla: " +this.talla+ "\n" ;
    }
    }

