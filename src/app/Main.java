package app;
// Main.java

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Electronics", "Laptop", 1200.0),
                new Product("Appliances", "Coffee maker", 80.0),
                new Product("Electronics", "Headphones", 150.0),
                new Product("Appliances", "Blender", 50.0)
        );

        Map<String, Double> result = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
        Optional<Map.Entry<String, Double>> averageCost = result.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Result of sorting categories: " + result);
        System.out.println("Category with highest average price: " + averageCost);
    }
}


