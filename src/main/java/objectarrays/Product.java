package objectarrays;

import java.util.*;

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;
    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }
    // Comparable Interface method to compare based on price
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    // Other methods and getters/setters can be added as needed


    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1.5, 20.0, 101));
        products.add(new Product(2.0, 15.0, 102));
        products.add(new Product(1.0, 25.0, 103));

        // Sorting based on price
        Collections.sort(products);

        // Displaying sorted products
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Price: $" + product.getPrice());
        }
    }
}


