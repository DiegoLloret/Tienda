/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego
 */
public class UsuarioTest {
    public UsuarioTest(){
    
}
   

	@Test
	public void testValidPass() {
            Usuario user=new Usuario ();
		String password="Diego2001";
		
		String esperado= "Diego2001";
		
                 user.ValidPass(password);
                 System.out.println(user.getPassword());
                 String resultado = user.getPassword();
		assertEquals(esperado, resultado);
	}
   
    public void testValidEm() {
            Usuario user=new Usuario ();
		String email="Diego2001";
		
		String esperado= "Diego2001@gmail.com";
		
                 user.ValidEm(email);
                 System.out.println(user.getEmail());
                 String resultado = user.getEmail();
		assertEquals(esperado, resultado);
	}
    public void testValidNom() {
            Usuario user=new Usuario ();
		String nombre="Diego";
		
		String esperado= "Diego9";
		
                 user.ValidNom(nombre);
                 System.out.println(user.getNombre());
                 String resultado = user.getNombre();
		assertEquals(esperado, resultado);
	}
    
}
