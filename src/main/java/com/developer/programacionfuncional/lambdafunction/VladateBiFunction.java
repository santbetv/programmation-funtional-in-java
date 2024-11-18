package com.developer.programacionfuncional.lambdafunction;

import java.util.function.BiFunction;

public class VladateBiFunction {

    public static void main(String[] args) {
        //Ejemplo de recibir datos de un tipo devolver otro tipo
        //El metodo apply recibe dos parametros
        //El tercer valor es el tipo de dato que se va a devolver
        // Si en una interfaz coloco @FunctionalInterface debe de cimplir con un solo metodo
        BiFunction<Integer, Integer, Integer> validate = Integer::sum;
        System.out.println(validate.apply(10, 20));

        BiFunction<Integer, Integer, String> validateString = (x, y) -> Integer.toString(x + y);
        System.out.println(validateString.apply(10, 20));


        System.out.println(Calculadora.calc(Integer::sum, 10, 20));
        System.out.println(Calculadora.calc((integer, integer2) -> integer-integer2, 10, 20));
        System.out.println(Calculadora.calc((integer, integer2) -> integer/integer2, 10, 20));
        System.out.println(Calculadora.calc((integer, integer2) -> integer*integer2, 10, 20));
    }

    class Calculadora {
        public static Integer calc(BiFunction<Integer, Integer, Integer> validate,int x, int y){
            return validate.apply(x, y);
        }
    }
}
