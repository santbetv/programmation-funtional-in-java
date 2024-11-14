/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.repasoigualda;

/**
 *
 * @author rizzoli
 */
public class IgualdadObjetos {
    
    public static void main(String[] args) {
        
        //comparation
        String valor1 = new String("1");
        String valor2 = new String("2");
        valor1= valor2;
        if (valor1==valor2) {
            System.out.println("Verdadero igual1");
        }
        //comparation
        String valor3 = new String("1");
        String valor4 = new String("2");
        if (valor3.equals(valor4)) {
            System.out.println("Verdadero igual2");
        }else{
            System.out.println("falso igual1");
            
        }
        
         //comparation
        String valor5 = new String("1");
        String valor6 = new String("1");
        if (valor5.equals(valor6)) {
            System.out.println("Verdadero igual3");
        }
        
        //comparation
        String valor7 = new String("1");
        String valor8 = new String("1");
        if (valor7==valor8) {
            System.out.println("Verdadero igual4");
        }else{
            System.out.println("falso igual2");
        }
        
    }
    
}
