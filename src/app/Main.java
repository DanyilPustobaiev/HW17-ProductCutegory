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
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        Optional<Map.Entry<String,Double>> averageCost = result.entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println("Результат сортировки категорий: " + result);
        System.out.println("Категория с самой высокой средней ценой: " + averageCost);



        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");
        hmap.put(55, "Orange");

        Map<Integer, String> resul = hmap.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));

        System.out.println("Result: " + resul);
    }
}


