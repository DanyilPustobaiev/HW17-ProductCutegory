package app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("Smartphones", "iPhone 15", 1200.00),
                new Product("Tablets", "iPad Air 13", 1050.00),
                new Product("Laptops", "MacBook Air", 1300.00),
                new Product("Headphones", "AirPods Pro", 260.00));

        Map<String, Double> sortByCategory = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));

        System.out.println("Result of sorting by categories: " + sortByCategory);

        Optional<Map.Entry<String, Double>> averagePrice = sortByCategory
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println("Category with highest average price: " + averagePrice);

    }
}
