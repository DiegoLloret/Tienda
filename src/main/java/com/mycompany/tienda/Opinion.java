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
public class Opinion {
    Usuario usuario=new Usuario();
    punt puntuacion;
    int voto_pos=0;
    int voto_neg=0;
    String comentario;

    public Opinion() {}

    public Opinion(punt puntuacion, String comentario) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }
    
    public void VotoPos(int voto_pos){
        voto_pos++;
    }
    public void VotoNeg(int voto_neg){
        voto_neg++;
    }
}
