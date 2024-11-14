/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.usandoenum;

/**
 *
 * @author rizzoli
 */
public class ValoresPorEnum {

    public enum Dias {
        LUNES(10), MARTES(20), MIERCOLES(30);
        int data;
        private Dias(int dato) {
            data=dato;
        }
    }
    
    public static void main(String[] args) {
        Dias d = Dias.LUNES;
        System.out.println("Valor de día es: " + d.data);
        
    }

}
