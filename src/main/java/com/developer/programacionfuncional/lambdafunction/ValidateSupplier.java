package com.developer.programacionfuncional.lambdafunction;

import java.time.LocalTime;
import java.util.function.Supplier;

public class ValidateSupplier {


    /*
     * Un Supplier en Java es una interfaz funcional que no toma ningún argumento y devuelve un resultado.
     * Es ideal para generar o proporcionar valores bajo demanda.
     * Aquí tienes un ejemplo sencillo usando un Supplier que devuelve un String.
     * */


    /*
    * ¿Cuándo usar Supplier?
    Para generar valores dinámicos que cambian cada vez que se llaman (como en el ejemplo de la hora).
    Para proveer valores predeterminados o cargar datos diferidos, lo que mejora la eficiencia si el valor no siempre es necesario.
    Cuando se necesita desacoplar la lógica de creación de valores del lugar donde se consumen.
     */



    public static void main(String[] args) {
        // Crear un Supplier para generar la hora actual como un String
        Supplier<String> timeSupplier = () -> "La hora actual es: " + LocalTime.now();

        // Usar el Supplier varias veces
        System.out.println(timeSupplier.get());
        try {
            Thread.sleep(1000); // Esperar 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(timeSupplier.get());
    }
}
