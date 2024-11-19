package com.developer.programacionfuncional.lambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValdiatePattern {

    public static void main(String[] args) {

        // Patrón para un correo electrónico válido
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        // Correos a validar
        String[] emails = {"example@test.com", "invalid-email@", "user@domain.co"};

        List<String> emailsList = Arrays.asList(emails);

        emailsList.stream().flatMap(email -> Arrays.stream(email.split(",")))
                .forEach(email -> {
                    Matcher matcher = pattern.matcher(email);
                    if (matcher.matches()) {
                        System.out.println(email + " es válido.");
                    } else {
                        System.out.println(email + " es inválido.");
                    }
                });

        System.out.println("/////////////////////////////");

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " es válido.");
            } else {
                System.out.println(email + " es inválido.");
            }
        }


        System.out.println("/////////////////////////////");
        // Texto de ejemplo
        String text = "En 2024, el precio del producto es $100, y en 2025 será $150.";

        // Patrón para extraer números
        String numberRegex = "\\d+";
        Pattern pattern2 = Pattern.compile(numberRegex);
        Matcher matcher = pattern2.matcher(text);

        System.out.println("Números encontrados:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
