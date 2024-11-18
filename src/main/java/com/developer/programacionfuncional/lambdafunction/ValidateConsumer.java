package com.developer.programacionfuncional.lambdafunction;

import java.util.List;
import java.util.function.Consumer;

public class ValidateConsumer {

    /*El Consumer en Java es útil cuando necesitas realizar una acción específica
    sobre cada elemento de una colección u objeto, sin devolver un resultado.
    Lo aplicas principalmente en situaciones donde la tarea es procesar datos o realizar efectos
    secundarios como imprimir, registrar, modificar un estado externo o almacenar datos.*/

    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Definir un Consumer que imprima cada número
        Consumer<Integer> printNumber = number -> System.out.println("Número: " + number);

        // Aplicar el Consumer a cada elemento de la lista
        numbers.forEach(printNumber);
    }

}
