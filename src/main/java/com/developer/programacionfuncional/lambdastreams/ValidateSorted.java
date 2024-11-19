package com.developer.programacionfuncional.lambdastreams;

import lombok.val;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ValidateSorted {

    public static void main(String[] args) {

        List<ValidateFilters.Empleado> empleados = new ArrayList<>();
        empleados.add(ValidateFilters.Empleado.builder()
                .nombre("Juan")
                .edad(25)
                .salario(1000.0)
                .build());
        empleados.add(ValidateFilters.Empleado.builder()
                .nombre("santi")
                .edad(40)
                .salario(3000.0)
                .build());
        empleados.add(ValidateFilters.Empleado.builder()
                .nombre("sebas")
                .edad(25)
                .salario(1500.0)
                .build());
        empleados.add(ValidateFilters.Empleado.builder()
                .nombre("andrea")
                .edad(42)
                .salario(1000.0)
                .build());

        //Ordenar empleados por salario
        empleados.stream()
                .sorted((empleado1, empleado2) -> Double.compare(empleado1.getSalario(), empleado2.getSalario()))
                .forEach(System.out::println);

        System.out.println("///////////////////////////////////////////");

        //Ordenar empleados por salario y edad
        empleados.stream()
                .filter(empleado -> empleado.getEdad() >= 40)
                .sorted((empleado1, empleado2) -> {
                    int resultado = Double.compare(empleado1.getSalario(), empleado2.getSalario());
                    if(resultado == 0){
                        return empleado1.getEdad() - empleado2.getEdad();
                    }
                    return resultado;
                })
                .forEach(System.out::println);



        System.out.println("///////////////////////////////////////////");
        //Ordenar empleados por edad
        empleados.stream()
                .sorted(Comparator.comparingInt(ValidateFilters.Empleado::getEdad))
                .forEach(System.out::println);

        System.out.println("///////////////////////////////////////////");

        //Ordenar empleados por nombre
        empleados.stream()
                .sorted(Comparator.comparing(ValidateFilters.Empleado::getNombre))
                .forEach(System.out::println);

        System.out.println("///////////////////////////////////////////");
        //Ordenar empleados por salario de forma descendente
        List<ValidateFilters.Empleado> empleados1 = empleados.stream()
                .sorted(Comparator.comparing(ValidateFilters.Empleado::getSalario).reversed())
                .toList();

        System.out.println(empleados1);

        System.out.println("///////////////////////////////////////////");
        //Sumar empleados con salarios
        val sumaSalarios = empleados.stream()
                .mapToDouble(ValidateFilters.Empleado::getSalario)
                .sum();


        System.out.println("Suma de salarios: " + sumaSalarios);

        //Tener el maximo salario
        val maxSalario = empleados.stream()
                .mapToDouble(ValidateFilters.Empleado::getSalario)
                .max();

        //Tener el minimo salario
        val minSalario = empleados.stream()
                .mapToDouble(ValidateFilters.Empleado::getSalario)
                .min();

        System.out.println("Maximo salario: " + maxSalario.getAsDouble() +"  "+"Minimo salario: " + minSalario.getAsDouble());

        System.out.println("///////////////////////////////////////////");
        //Ordenar empleados por salario mayor y edad de mayor
        empleados.stream()
                .sorted(Comparator.comparing(ValidateFilters.Empleado::getEdad).reversed()
                        .thenComparing(Comparator.comparing(ValidateFilters.Empleado::getSalario).reversed()))
                .forEach(System.out::println);


        System.out.println("///////////////////////////////////////////");
        val estadisticasSalarios = empleados.stream()
                .mapToDouble(ValidateFilters.Empleado::getSalario)
                .summaryStatistics();

        System.out.println("///////////////////////////////////////////");
        System.out.println("Estadisticas de salarios: " + estadisticasSalarios);
    }
}
