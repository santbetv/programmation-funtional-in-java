/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.iterablescolecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rizzoli
 */
public class ElementoIterator {
    
    private static List<String> datos = new ArrayList<>();
    
    public static void main(String[] args) {
        datos.add("v1");
        datos.add("v2");
        datos.add("v3");
        Iterator<String> iter = datos.iterator();
        while (iter.hasNext()) {
            System.out.println("Valor es: " + iter.next());    
        }
    }
    
    
    
}
