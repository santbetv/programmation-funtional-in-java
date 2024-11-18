package com.developer.programacionfuncional.lambdafunction;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ValidateFunction {

    //Ejemplo de recibir datos de un tipo devolver solo un tipo.
    public static void main(String[] args) {
        UnaryOperator<String> validate = x -> x + "!";
        System.out.println(validate.apply("10"));

        UnaryOperator<Integer> validateString = x -> x+10;
        System.out.println(validateString.apply(10));

        Integer validateString2 = Evaluador.evaluar(x -> (int) x + 10, 5);
        System.out.println(validateString2);
    };

    class Evaluador {

        public static Integer evaluar(UnaryOperator x, int valor) {
            return (Integer) x.apply(valor);
        }
    }
}
