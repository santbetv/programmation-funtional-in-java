package com.developer.programacionfuncional.lambdacaluladora;

public class ValidarCalculadoraa {

    public static void main(String[] args) {
        Calculadora suma = (a, b) -> a + b;
        Calculadora resta = (a, b) -> a - b;
        Calculadora multiplicacion = (a, b) -> a * b;
        Calculadora division = (a, b) -> {
            if (b == 0) {
                return 0;
            }
            return a / b;
        };

        System.out.println("Suma: " + suma.operacion(5, 3));
        System.out.println("Resta: " + resta.operacion(5, 3));
        System.out.println("Multiplicacion: " + multiplicacion.operacion(5, 3));
        System.out.println("Division: " + division.operacion(5, 3));
    }
}
