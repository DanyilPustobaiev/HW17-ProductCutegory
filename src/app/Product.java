package app;


public class Product {

    private String category;
    private String model;
    private double price;

    public Product(String category, String model, double price) {
        this.category = category;
        this.model = model;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", model='" + model + '\'' +
                ", price= " + price +
                '}';
    }
}
