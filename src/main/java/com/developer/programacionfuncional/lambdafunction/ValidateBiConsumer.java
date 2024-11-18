package com.developer.programacionfuncional.lambdafunction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class ValidateBiConsumer {

    /*Cómo las nuevas características de Java simplifican tareas comunes como recorrer un mapa.
    El uso de BiConsumer elimina la necesidad de manejar iteradores manualmente,
    haciendo el código más limpio y menos propenso a errores.*/
    public static void main(String[] args) {
        // Crear un Map de productos y precios
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Camiseta", 19.99);
        productPrices.put("Pantalón", 29.99);
        productPrices.put("Zapatos", 49.99);

        System.out.println("---- Usando Iterator ----");
        // Usando Iterator para recorrer el Map
        Iterator<Map.Entry<String, Double>> iterator = productPrices.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println("Producto: " + entry.getKey() + ", Precio: $" + entry.getValue());
        }

        System.out.println("\n---- Usando BiConsumer ----");
        // Usando BiConsumer para recorrer el Map
        BiConsumer<String, Double> printProductAndPrice = (product, price) ->
                System.out.println("Producto: " + product + ", Precio: $" + price);

        productPrices.forEach(printProductAndPrice);
    }
}
