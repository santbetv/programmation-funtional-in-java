/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.claseoptional;

/**
 *
 * @author santiago betancur
 */
public class EjecutarOptional {
    
    public static void main(String[] args) {
        
        MetodoOptional metodoOptional = new MetodoOptional();
        //-- Jav 11
        metodoOptional.estaVacio(null);
        metodoOptional.estaVacio(new Persona());
        metodoOptional.estaVacio(new Persona(1, "Santiago"));
        //-- Java 8
        metodoOptional.estaPresente(null);
        metodoOptional.estaPresente(new Persona());
        metodoOptional.estaPresente(new Persona(1, "Santiago"));
    }
    
}
