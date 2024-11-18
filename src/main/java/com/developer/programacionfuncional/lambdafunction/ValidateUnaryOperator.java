package com.developer.programacionfuncional.lambdafunction;

import java.util.function.UnaryOperator;

public class ValidateUnaryOperator {

    //Es parecido a Function, pero recibe y devuelve el mismo tipo de dato.
    //UnaryOperator<T> es una interfaz funcional que toma un solo argumento del tipo T y devuelve un resultado del mismo tipo T.

    public static void main(String[] args) {
        // Crear un UnaryOperator para duplicar un número
        UnaryOperator<Integer> duplicar = x -> x * 2;

        // Usar el UnaryOperator varias veces
        System.out.println(duplicar.apply(2)); // 4
        System.out.println(duplicar.apply(3)); // 6
        System.out.println(duplicar.apply(4)); // 8
    }


}
