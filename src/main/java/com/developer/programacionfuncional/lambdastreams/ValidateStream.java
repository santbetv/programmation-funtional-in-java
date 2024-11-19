package com.developer.programacionfuncional.lambdastreams;

import java.util.List;

public class ValidateStream {

    public static void main(String[] args) {

        //Sumar impares al cuadrado

        // Sin Stream
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int suma =0;
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                int cuadrado = number * number;
                suma += cuadrado;
            }
        }
        System.out.println("Suma de cuadrados de numeros pares: " + suma);


        // Con Stream

        int sumaStream = numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .reduce(0, Integer::sum);

        System.out.println("Suma de cuadrados de numeros pares con Stream: " + sumaStream);
    }
}
