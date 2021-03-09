/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.Scanner;

/**
 *
 * @author Alumno 3
 */
public class Usuario {
   Scanner sc = new Scanner(System.in);

    private String nombre;
    private String password;
    private String email;
public Usuario(){}

    public Usuario(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    public void ContraSeg(String password){
      int mayus=0;
      int minus=0;
       
       if(password.length()>7){
        for (int i = 0; i <password.length(); i++) {
            if(password.charAt(i)<=65 && password.charAt(i)>=90){
                mayus++;}
            else {
                minus++;
            }
        }
        if (mayus!=0 ||minus!=0){
            setPassword(password);
        }
        else{
            setPassword("Qwertyuio");
        } 
       }
       else{
            setPassword("Qwertyuio");
        }  
      
}
  public void ValidEm(String email){
      int arroba=0;
      
       for (int i = 0; i <email.length(); i++) {
            if(email.charAt(i)==64 ){
                arroba++;
            }
       }
            if(arroba!=0){
                setEmail(email);
            }
            
  }   
       public void ValidNom(String nombre){
        
           if(nombre.length()<5){
               setNombre(nombre);
           }else{
               for (int i = nombre.length(); i < 6; i++) {
                   
               }
           }     
               
         
                  
       }   
    
}
