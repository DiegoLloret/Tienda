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
        ValidNom(nombre);
        ValidPass(password);
        ValidEm(email);
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
    public void ValidPass(String password){
      
       
       if(password.length()>7){
        
            if(password.matches("[A-Z]+")==true){
             
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
      
       if(email.matches("(?:[\\p{L}0-9!#$%\\&'*+/=?\\^_`{|}~-]+(?:\\.[\\p{L}0-9!#$%\\&'*+/=?\\^_`{|}" +
    "~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\" +
    "x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[\\p{L}0-9](?:[a-" +
    "z0-9-]*[\\p{L}0-9])?\\.)+[\\p{L}0-9](?:[\\p{L}0-9-]*[\\p{L}0-9])?|\\[(?:(?:25[0-5" +
    "]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-" +
    "9][0-9]?|[\\p{L}0-9-]*[\\p{L}0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21" +
    "-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")==true){
           setEmail(email);
       }
       else{
           String correo=email+"@gmail.com";
           setEmail(correo);
       }    
            
  }   
       public void ValidNom(String nombre){
        
           if(nombre.matches("[6-15]0")==true){
               setNombre(nombre);
           }else{
               for (int i = nombre.length(); i < 6; i++) {
                  String nombre1=nombre+"9";
                  setNombre(nombre1);
               }
           }     
               
         
                  
       }   
    
}
