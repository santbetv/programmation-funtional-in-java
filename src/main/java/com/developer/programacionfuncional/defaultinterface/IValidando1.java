/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.defaultinterface;

/**
 *
 * @author rizzoli
 */
public interface IValidando1 {
    
    default int valida1(){
        System.out.println("default valida1");
        return 1;
    }
    
    public void enValidacionUno();
    
}
