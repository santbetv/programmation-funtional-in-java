package com.developer.programacionfuncional.lambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidateFlatMap {

    public static void main(String[] args) {

        /*
         1. Transformar datos anidados en listas planas
           Ejemplo real: Una tienda tiene productos, y cada producto tiene una lista de categorías.
           Si necesitas todas las categorías únicas de todos los productos, puedes usar flatMap.
        * */

        // Lista de productos con sus categorías
        Map<String, List<String>> products = Map.of(
                "Laptop", Arrays.asList("Electronics", "Computing"),
                "Shoes", Arrays.asList("Fashion", "Footwear"),
                "Phone", Arrays.asList("Electronics", "Mobile", "Computing")
        );

        // Obtener todas las categorías únicas usando flatMap
        List<String> uniqueCategories = products.values().stream()
                .flatMap(List::stream) // Convierte listas anidadas en un flujo único
                .distinct() // Elimina duplicados
                .toList();

        System.out.println("Categorías únicas: " + uniqueCategories);


        System.out.println("/////////////////////////////");

        /*
         2. Combinar elementos de múltiples colecciones
          Ejemplo real: Supongamos que tienes listas de ingredientes para diferentes recetas
         y necesitas generar todas las combinaciones posibles de recetas.
        * */

        // Ingredientes principales y secundarios
        List<String> mains = Arrays.asList("Pollo", "Pescado", "Tofu");
        List<String> sides = Arrays.asList("Arroz", "Ensalada", "Papas Fritas");

        // Generar combinaciones de platos
        List<String> combinations = mains.stream()
                .flatMap(main -> sides.stream().map(side -> main + " con " + side))
                .collect(Collectors.toList());

        System.out.println("Combinaciones de platos: " + combinations);


        System.out.println("/////////////////////////////");

        /*
        * 3. Procesar datos complejos en APIs
        Ejemplo real: Una API devuelve datos jerárquicos:
        usuarios y sus pedidos. Si quieres una lista plana de todos los productos pedidos por todos los usuarios:
        * */


        class Order {
            String product;
            int quantity;

            public Order(String product, int quantity) {
                this.product = product;
                this.quantity = quantity;
            }

            public String getProduct() {
                return product;
            }
        }

        // Datos simulados: usuarios y sus pedidos
        Map<String, List<Order>> userOrders = Map.of(
                "Alice", Arrays.asList(new Order("Laptop", 1), new Order("Mouse", 2)),
                "Bob", Arrays.asList(new Order("Keyboard", 1), new Order("Laptop", 1)),
                "Charlie", Arrays.asList(new Order("Monitor", 1))
        );

        // Obtener una lista plana de productos pedidos
        List<String> allProducts = userOrders.values().stream()
                .flatMap(orders -> orders.stream().map(Order::getProduct))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Productos pedidos: " + allProducts);
    }
}
