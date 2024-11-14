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
public class ClasesEstandaresEstaticasAnidadas {

    private final int valorGlobal = 0;

    public int getValorGlobal() {
        return valorGlobal;
    }

    public ClasesEstandaresEstaticasAnidadas() {
    }

    class Externa {

        private final int valorExterno = 1;

        public int getValorExterno() {
            return valorExterno;
        }

        public Externa() {
        }

        class Interna {

            private final int valorInterno = 2;

            public int getValorInterno() {
                return valorInterno;
            }

            public Interna() {
            }

        }

    }

    static class ClaseInternaStatic {
        private final int valorInternoStatico = 3;

        public int getValorInternoStatico() {
            return valorInternoStatico;
        }
        
        
        
    }

}
