package com.developer.programacionfuncional.iterablescolecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementosSort {

    //Ejemplo de dos metodos con mayor codigo y con menor codigo
    public static void main(String[] args) {

        // Ordenar la lista con Collections.sort
        List<String> list = Arrays.asList("5", "A", "3", "B", "1", "C", "2", "D", "4");

        Collections.sort(list);

        System.out.println("Lista ordenada: " + list);

        // Ordenar de manera mayor codigo: números primero y luego letras
        Collections.sort(list, (a, b) -> {
            boolean isDigitA = Character.isDigit(a.charAt(0));
            boolean isDigitB = Character.isDigit(b.charAt(0));

            if (isDigitA && isDigitB) {
                // Ambos son números, comparar como números
                return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
            } else if (!isDigitA && !isDigitB) {
                // Ambos son letras, comparar como cadenas
                return a.compareTo(b);
            } else {
                // Si uno es número y el otro letra, los números tienen prioridad
                return isDigitA ? -1 : 1;
            }
        });

        System.out.println("Lista personalizada (números primero, luego letras): " + list);

    }

}
