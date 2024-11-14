/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.clasesanidadas;

/**
 *
 * @author rizzoli
 */
public class ClaseLocalEnMetodo {

    private int externa = 5;

    public int Metodo() {
        int internaAlMetodo = 5;
        
        class Local {

            //Se pueden cualquiera de las dos lo importante es no cambiar de valor
            private final int valorGlobal = 5;
            //private int valorGlobal = 5;

            public int getValorGlobal() {
                return valorGlobal + internaAlMetodo + externa;
            }

        }
        
        Local local = new Local();
        return local.getValorGlobal();
    }

}
