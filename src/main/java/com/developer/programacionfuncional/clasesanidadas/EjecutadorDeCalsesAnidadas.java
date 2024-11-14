/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.clasesanidadas;

import static java.lang.System.out;

/**
 *
 * @author rizzoli
 */
public class EjecutadorDeCalsesAnidadas {

    public static void main(String[] args) {

        ClasesEstandaresEstaticasAnidadas clasesNormalesAnidadas = new ClasesEstandaresEstaticasAnidadas();
        ClasesEstandaresEstaticasAnidadas.Externa externa = clasesNormalesAnidadas.new Externa();
        ClasesEstandaresEstaticasAnidadas.ClaseInternaStatic claseInternaStatic = new ClasesEstandaresEstaticasAnidadas.ClaseInternaStatic();
        ClasesEstandaresEstaticasAnidadas.Externa.Interna interna = externa.new  Interna();
        ClaseLocalEnMetodo claseLocalEnMetodo = new ClaseLocalEnMetodo();
        
        Runnable rb = new Runnable() {
            @Override
            public int run() {
                return 34;
            }
        };
        
        System.out.println("imprimiendo dato clase prinpal: " + clasesNormalesAnidadas.getValorGlobal());
        System.out.println("imprimiendo dato clase externa: " + externa.getValorExterno());
        System.out.println("imprimiendo dato clase interna: " + interna.getValorInterno());
        System.out.println("imprimiendo dato clase interna static: " + claseInternaStatic.getValorInternoStatico());
        System.out.println("imprimiendo dato clase local en metodo: " + claseLocalEnMetodo.Metodo());
        System.out.println("imprimiendo dato de clase anonima: " +  rb.run());
    }
    

}
