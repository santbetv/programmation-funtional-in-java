package com.developer.programacionfuncional.funtionalinterfacelambda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santiago betancur
 */
public class EjecucionClaseLambda {
    
    public static void main(String[] args) {
        
        Lambda elementosLambda = new Lambda();
        
        elementosLambda.validarListaImparesLambda("IMPAR", 1,2,3,4,5,6,7,8,9);
        System.out.print("\n");
        elementosLambda.validarListaImparesLambda("PAR", 1,2,3,4,5,6,7,8,9);
        System.out.print("\n");
        elementosLambda.sumar();
        System.out.print("\n");

    }
}
