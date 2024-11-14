/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.iterablescolecciones;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author rizzoli
 */
public class ElementosTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> tabla = new TreeMap<>();
        tabla.put(3, "valor3");
        tabla.put(1, "valor1");
        tabla.put(2, "valor2");
        
        //Imprime de manera ordenada
        tabla.values().forEach(arg -> {
            System.out.println("valores: "+ arg);
        });
        
    }
    
    
    
}
