package com.developer.programacionfuncional.lambdastreams;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ValidateMap {

    //La principal funcional de map es transformar un objeto en otro
    //Modificar los datos en la iteracion de un Stream y devolver un nuevo Stream con los datos modificados


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


        //Sumar impares al cuadrado
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumaStream = numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .reduce(0, Integer::sum);

        List<Integer> datosFiltradosImparesMultiplicados = numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .toList();


        OptionalDouble valorAVG = empleados.stream()
                .mapToDouble(empleado -> empleado.getSalario())
                .average();

        System.out.println("Suma de cuadrados de numeros pares con Stream: " + sumaStream);
        System.out.println("Datos filtrados impares multiplicados: " + datosFiltradosImparesMultiplicados);
        System.out.println("Promedio de salarios: " + valorAVG.getAsDouble());
    }
}
