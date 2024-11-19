package com.developer.programacionfuncional.lambdastreams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ValidateStreamPipeline {

    //Canalizacion de flujo de datos apartir de  valores.

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("uno", "dos", "tres", "cuatro", "cinco");
        stream1.forEach(System.out::println);

        System.out.println("/////////////////////////////");
        String[] array = {"uno", "dos", "tres", "cuatro", "cinco"};
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(System.out::println);

        System.out.println("/////////////////////////////");
        IntStream stream3 = IntStream.of(1, 2, 3, 4, 5);
        stream3.forEach(System.out::println);

        System.out.println("/////////////////////////////");
        IntStream stream4 = IntStream.range(0, 10);
        stream4.forEach(System.out::println);

        System.out.println("/////////////////////////////");
        IntStream stream5 = IntStream.rangeClosed(0, 10);
        stream5.forEach(System.out::println);

        System.out.println("/////////////////////////////");


        Stream<Long> iterable = Stream.iterate(0L, n -> n + 1)
                .limit(10);

        iterable.forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Stream<String> stream6 = Stream.generate(() -> "elemento")
                .limit(10);

        stream6.forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(10) //Salta los primeros 10 elementos
                .limit(10)
                .forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(10) //Salta los primeros 10 elementos
                .limit(10)
                .map(n -> n * n) //Eleva al cuadrado los elementos del stream intermedio
                .forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Optional<Long> value =  Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(10) //Salta los primeros 10 elementos
                .limit(10)
                .map(n -> n * n) //Eleva al cuadrado los elementos del stream intermedio
                .reduce(Long::sum);
                //.ifPresent(System.out::println);

        System.out.println(value.orElse(0L));

        System.out.println("/////////////////////////////");

        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(10) //Salta los primeros 10 elementos
                .peek(n -> System.out.println("Numero: " + n)) //Validar que el stream intermedio este correcto
                .limit(10)
                .forEach(System.out::println);

        System.out.println("/////////////////////////////");

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}
