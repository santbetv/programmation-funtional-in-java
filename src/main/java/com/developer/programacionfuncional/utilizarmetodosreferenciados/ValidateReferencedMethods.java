package com.developer.programacionfuncional.utilizarmetodosreferenciados;

public class ValidateReferencedMethods {

    public static void main(String[] args) {
        // Referencia a un método estático
        Validate validate = ValidateReferencedMethods::validate;
        System.out.println(validate.validate("Hola Mundo"));

        // Referencia a un método de instancia
        ValidateReferencedMethods validateReferencedMethods = new ValidateReferencedMethods();
        Validate validate2 = validateReferencedMethods::validate2;
        System.out.println(validate2.validate("Hola Mundo"));

        // Referencia a un método de instancia de un objeto arbitrario de un tipo particular
        Validate validate3 = new ValidateReferencedMethods()::validate3;
        System.out.println(validate3.validate("Hola Mundo"));
    }

    public static boolean validate(String text) {
        return text != null && text.length() > 0;
    }

    public boolean validate2(String text) {
        return text != null && text.length() > 0;
    }

    public boolean validate3(String text) {
        return text != null && text.length() > 0;
    }

    @FunctionalInterface
    interface Validate {
        boolean validate(String text);
    }
}
