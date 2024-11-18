package com.developer.programacionfuncional.lambdafunction;

import java.util.function.Predicate;

public class ValidatePredicate {
    public static void main(String[] args) {

        Predicate<Integer> validate = x -> x > 10;
        System.out.println(validate.test(10));
        System.out.println(validate.test(20));

        System.out.println(Evaluador.evaluar(x -> x > 5, 10));
        System.out.println(Evaluador.evaluar(x -> x > 20, 10));
    }

    class Evaluador {
        public static boolean evaluar(Predicate<Integer> validate, int x){
            return validate.test(x);
        }
    }
}
