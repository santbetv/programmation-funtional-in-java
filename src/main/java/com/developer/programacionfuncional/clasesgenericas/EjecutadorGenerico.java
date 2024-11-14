/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.clasesgenericas;

/**
 *
 * @author rizzoli
 */
public class EjecutadorGenerico {
    
    public static void main(String[] args) {
        
        Bean<String> valorCaracter = new Bean<>("Dato");
        Bean<Integer> valorNumerico = new Bean<>(456);
        Bean.mostrarDato(valorCaracter);
        Bean.mostrarDato(valorNumerico);
        
    }
    
}
