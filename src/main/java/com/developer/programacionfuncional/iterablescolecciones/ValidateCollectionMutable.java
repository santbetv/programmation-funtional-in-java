package com.developer.programacionfuncional.iterablescolecciones;

import com.developer.programacionfuncional.lambdastreams.ValidateFilters;

import java.util.*;
import java.util.stream.Collectors;

public class ValidateCollectionMutable {


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
                .edad(26)
                .salario(1500.0)
                .build());
        empleados.add(ValidateFilters.Empleado.builder()
                .nombre("andrea")
                .edad(42)
                .salario(1000.0)
                .build());

        List<String> nombreStrings = empleados.stream()
                .map(ValidateFilters.Empleado::getNombre)
                .toList();
        System.out.println(nombreStrings);

        Set<String> nombreSet = empleados.stream()
                .map(ValidateFilters.Empleado::getNombre)
                .collect(Collectors.toSet());
        System.out.println(nombreSet);

        SortedSet<String> nombreSortedSet = empleados.stream()
                .map(ValidateFilters.Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(nombreSortedSet);

        System.out.println("//////////////////////////////");
        //Mapiando datos con su id(unico) y clave valor
        Map<Integer,Double> idTipoEdad =
                empleados
                        .stream()
                        //se pueden hacer validaciones antes de mapear
                        .collect(Collectors.toMap(
                                ValidateFilters.Empleado::getEdad,ValidateFilters.Empleado::getSalario
                        ));
        System.out.println(idTipoEdad);

        System.out.println("//////////////////////////////");

        //Mapiando datos con su id(unico) y clave valor,agrupando datos
        Map<Double,String> idTipoSalarioAgrupandoParaNombre = empleados
                .stream()
                //se pueden hacer validaciones antes de mapear
                .collect(Collectors.toMap(
                        ValidateFilters.Empleado::getSalario,ValidateFilters.Empleado::getNombre,(nom1,nom2) -> String.join(",",nom1,nom2)
                ));
        System.out.println(idTipoSalarioAgrupandoParaNombre);

        System.out.println("//////////////////////////////");

        //Particionando datos a partir de una condicion
        empleados
                .stream()
                //se pueden hacer validaciones antes de mapear
                .collect(Collectors.partitioningBy(empleado -> empleado.getNombre().length() > 4))
                .forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
