package com.developer.programacionfuncional.lambdastreams;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidateFilters {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class Empleado {
        private String nombre;
        private int edad;
        private double salario;
    }

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(Empleado.builder()
                .nombre("Juan")
                .edad(25)
                .salario(1000.0)
                .build());
        empleados.add(Empleado.builder()
                .nombre("santi")
                .edad(40)
                .salario(3000.0)
                .build());
        empleados.add(Empleado.builder()
                .nombre("sebas")
                .edad(25)
                .salario(1500.0)
                .build());
        empleados.add(Empleado.builder()
                .nombre("andrea")
                .edad(42)
                .salario(1000.0)
                .build());

        // Filtrar empleados con salario mayor a 1000
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 1000)
                .forEach(System.out::println);


        System.out.println("Empleados con salario mayor a 1000 y edad 25");
        val peek = empleados.stream()
                .filter(empleado -> empleado.edad == 25 && empleado.salario > 1000)
                .toList();

        System.out.println(peek);


    }
}
