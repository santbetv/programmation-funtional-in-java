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
public interface IValidandoPrivados {

    private int sumar(){ return 5 + 4; }

    default int valoloresSumados() {
        return sumar();
    }

}
