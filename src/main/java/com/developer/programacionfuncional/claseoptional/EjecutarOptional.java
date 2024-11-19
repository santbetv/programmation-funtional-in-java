/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.claseoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 *
 * @author santiago betancur
 */
public class EjecutarOptional {
    
    public static void main(String[] args) {
        
        MetodoOptional metodoOptional = new MetodoOptional();
        //-- Jav 11
        metodoOptional.estaVacio(null);
        metodoOptional.estaVacio(new Persona());
        metodoOptional.estaVacio(new Persona(1, "Santiago"));
        //-- Java 8
        metodoOptional.estaPresente(null);
        metodoOptional.estaPresente(new Persona());
        metodoOptional.estaPresente(new Persona(1, "Santiago"));

        List<Optional<Persona>> personas = new ArrayList<>();

        personas.add(Optional.of(new Persona(1, "Santiago")));
        personas.add(Optional.of(new Persona(2, "Juan")));

        //Imprimir la persona que se encuentre en la lista apartir de ifPresentOrElse,
        // que permite ejecutar una acción si el valor está presente y otra si no lo está.
        personas.stream()
                .filter(p -> Objects.equals(p.get().getNombre(), "Carlos"))
                .findAny()
                .ifPresentOrElse(
                        p -> System.out.println("Persona: " + p.get().getNombre()),
                        () -> System.out.println("No hay persona")
                );
    }
    
}
