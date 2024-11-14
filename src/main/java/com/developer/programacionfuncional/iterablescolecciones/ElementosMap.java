/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.iterablescolecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rizzoli
 */
public class ElementosMap {
    
    public static void main(String[] args) {
        
        Map<Integer, String> datos = new HashMap<>();
        datos.put(0, "valor0");
        datos.put(1, "valor1");
        datos.put(2, "valor2");
        
        System.out.println("tamaño: " + datos.size());
        System.out.println("devuelve el valor: " + datos.get(1));
        System.out.println("devuelve si esta en calve: " + datos.containsKey(2));
        System.out.println("devuelve si esta en valor: " + datos.containsValue("hola"));
        
        //recorrer valores
        Collection<String> tabla = datos.values();
        Collection<Integer> tabla2 = datos.keySet();
        for (String string : tabla) {
            System.out.println("imprime: " + string);
        }
        
        tabla2.forEach(valor -> {
            System.out.println("imprime valores: "+ valor);
        });
    }
    
}
