/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.claseoptional;

import java.util.Optional;

/**
 *
 * @author santiago betancur
 */
public class MetodoOptional {

    //Java 11
    public void estaVacio(Persona persona) {

        //Validar esta clase que permite manejo de objetos
        Optional<Persona> perOptional = Optional.ofNullable(persona);
        if (perOptional.isEmpty()) {
            System.out.println("Java 11 - esta vacio");

        } else {
            System.out.println("java 11 - esta lleno " + perOptional.get().getNombre());
        }
    }

    //Java 8
    public void estaPresente(Persona persona) {

        Optional<Persona> perOptional = Optional.ofNullable(persona);
        if (!perOptional.isPresent()) {
            System.out.println("Java 8 - esta vacio");

        } else {
            System.out.println("java 8 - esta lleno " + perOptional.get().getNombre());
        }
    }

}
