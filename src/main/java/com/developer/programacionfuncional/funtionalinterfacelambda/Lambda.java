/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional.funtionalinterfacelambda;

import java.util.stream.IntStream;

/**
 *
 * @author santiago betancur
 */
public class Lambda {

    /// (var x, y) -> x.process(y) 
    // Cannot mix var and inferred formal parameters 
    // in implicitly typed lambda expressions 
    // (var x, int y) -> x.process(y) 
    // Cannot mix var and manifest types 
    // in explicitly typed lambda expressionsF
    public void validarListaImparesLambda(String seleccion, int... lista) {

        //Se utiliza of definiendo la lista de enteros 
        //filter para iterar
        //operador var para que itere en este tipo de dato 
        //forEach mostrando cada valor requerido 
        //operador :: simplificando el llamado de los metodos,
        //------------------------------
        //las referecias de los metodos nos permiten reutillizar metodo como expresion lambda
        //utlizando referenciaObjetivo::nombreDelMetodo exiten tres tipos
        // Métodos estáticos.
        // Métodos de instancia de un tipo.
        // Métodos de instancia de un objeto existente.
        //--
        // ejemplos: File::canRead // en lugar de File f -> f.canRead();
        //--
        // (String info) -> System.out.println(info) // Expresión lambda sin referencias.
        // System.out::println // Expresión lambda con referencia a método estático.
        //--
        // Student student -> getMarks(student) // Expresión lambda sin referencias.
        // this::getMarks // Expresión lambda con referencia a método de un objeto existente.
        switch (seleccion) {
            case "PAR":
                IntStream.of(lista).filter((var i) -> i % 2 == 0).forEach(datos -> System.out.print(datos));
                break;
            case "IMPAR":
                IntStream.of(lista).filter((var i) -> i % 2 != 0).forEach(System.out::print);
                break;
        }

    }

    public void sumar() {

        //Se utiliza para apoyo en las posibles definiciones aritmeticas que yo requiero
        IOperacion operacion = (double x, double y) -> (x + y);
        double resultado = operacion.calcular(2, 2.0);
        System.out.println(resultado);

    }

}
