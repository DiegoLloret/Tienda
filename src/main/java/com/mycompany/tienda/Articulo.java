/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * @author Alumno 3
 */
public abstract class Articulo {


	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
        private ArrayList<Opinion> opiniones;
	
	public Articulo() {
        opiniones=new ArrayList<Opinion>();
        };
	
	public Articulo(String codigo,String nombre,float precio, int stock){
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
                opiniones=new ArrayList<Opinion>();
	}
        /**
 * Metodo abstracto a implementar por clases hija.
 * @param codigopromo 
 */
        public abstract void applyPromo(String codigopromo);
            
        
	
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	@Override
	public String toString() {
		return "Codigo: "+this.codigo+"\nnombre:"+this.nombre+"\nnprecio:"+this.precio+"\nstock:"+this.stock+"\n"+"\nValoracion opiniones"+this.mediaOpi()+"\n";
	}
	public boolean disponible (int cantidad) {
		return cantidad<stock;
	}
	public void ajustarStock(int cantidad) {
		this.stock += cantidad;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (this.getClass() != o.getClass())
			return false;
		else
		{
			Articulo a = (Articulo) o;
			if (this.codigo.equals(a.getCodigo()))
					return true;
			else
				return false;
		}
	}
        public void AddOpinion(Opinion opinion){
            opiniones.add(opinion);
        }
        public String showOpinions(){
            StringBuilder sb= new StringBuilder();
            for (Opinion o: opiniones) {
			sb.append("\n").append(o);
		}
            return sb.toString();
        }
       public float mediaOpi(){
          int puntuacion=0;
          float media=0;
           for (Opinion o: opiniones) {
           if(o.getPuntuacion()==punt.horrible){
              puntuacion+=1;
              
           }
           if(o.getPuntuacion()==punt.malo){
              puntuacion+=2;
               
            }
           if(o.getPuntuacion()==punt.normal){
               puntuacion+=3;
              
           }
           if(o.getPuntuacion()==punt.bueno){
             puntuacion+=4;
              
           }
           if(o.getPuntuacion()==punt.perfecto){
               puntuacion+=5;
               
           }
           if(opiniones.size()>0){
               media=puntuacion/opiniones.size();
           }
}
          return media;
}
       
}