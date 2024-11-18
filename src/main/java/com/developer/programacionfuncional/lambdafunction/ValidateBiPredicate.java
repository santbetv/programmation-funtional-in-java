package com.developer.programacionfuncional.lambdafunction;

import java.util.function.BiPredicate;

public class ValidateBiPredicate {
    public static void main(String[] args) {

        //Metodos para condiciones de validacion con diferentes criterios
        BiPredicate<Integer, Integer> validate = (x, y) -> x > y;

        BiPredicate<Integer, Integer> validate2 = (x, y) -> x < y;

        BiPredicate<Integer, Integer> criterio = validate.or(validate2);

        System.out.println(Evaluador.evaluar(criterio, 10, 20));
        System.out.println(Evaluador.evaluar(criterio, 10, 20));
    }

    class Evaluador {
        public static boolean evaluar(BiPredicate<Integer, Integer> validate, int x, int y){
            return validate.test(x, y);
        }
    }
}
