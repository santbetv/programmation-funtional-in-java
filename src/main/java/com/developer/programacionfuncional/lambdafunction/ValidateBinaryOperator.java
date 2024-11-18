package com.developer.programacionfuncional.lambdafunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ValidateBinaryOperator {

    /*
    * Un BinaryOperator en Java es una interfaz funcional que representa una operación sobre dos operandos del mismo tipo
    *  y produce un resultado del mismo tipo.
    * Es útil para realizar cálculos como encontrar el máximo o mínimo entre dos números.
    * */

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 4, 19, 33, 27, 2);

        // BinaryOperator para encontrar el máximo
        BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy((Integer x, Integer y) -> x.compareTo(y));
        int resutadoMax = maxOperator.apply(10, 20);


        // BinaryOperator para encontrar el mínimo
        BinaryOperator<Integer> minOperator = BinaryOperator.minBy((Integer x, Integer y) -> x.compareTo(y));
        int resutadoMin = minOperator.apply(10, 20);

        numbers.stream().reduce(BinaryOperator.maxBy((Integer x, Integer y) -> x.compareTo(y))).ifPresent(System.out::println);
        numbers.stream().reduce(BinaryOperator.minBy((Integer x, Integer y) -> x.compareTo(y))).ifPresent(System.out::println);

        System.out.println("Máximo: " + resutadoMax); // Salida: Máximo en la lista: 20
        System.out.println("Mínimo " + resutadoMin); // Salida: Mínimo en la lista: 10
    }
}
