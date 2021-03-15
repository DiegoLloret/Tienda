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
    private Usuario usuario;
    private punt puntuacion;
    private int voto_pos;
    private int voto_neg;
    private String comentario;

    public Opinion() {
    voto_pos=0;
    voto_neg=0;
    }

    public Opinion(punt puntuacion, String comentario,Usuario usuario) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.usuario=usuario;
        voto_pos=0;
        voto_neg=0;
    }
    /**
 *
 * @param voto_pos
 * incrementa voto_pos en 1
 */
    public void VotoPos(int voto_pos){
        voto_pos++;
    }
    public void VotoNeg(int voto_neg){
        voto_neg++;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario").append(getUsuario());
        sb.append("\n puntuaciones").append(getPuntuacion());
        sb.append("\n Comentarios").append(getComentario());
        sb.append("\n Voto positivo").append(getVoto_pos());
        sb.append("\n Voto negativo").append(getVoto_neg());
        sb.append('\n');
        return sb.toString();
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the puntuacion
     */
    public punt getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(punt puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * @return the voto_pos
     */
    public int getVoto_pos() {
        return voto_pos;
    }

    /**
     * @param voto_pos the voto_pos to set
     */
    public void setVoto_pos(int voto_pos) {
        this.voto_pos = voto_pos;
    }

    /**
     * @return the voto_neg
     */
    public int getVoto_neg() {
        return voto_neg;
    }

    /**
     * @param voto_neg the voto_neg to set
     */
    public void setVoto_neg(int voto_neg) {
        this.voto_neg = voto_neg;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
