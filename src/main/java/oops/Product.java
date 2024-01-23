package oops;

public class Product {
    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product p = new Product();

         p.setPrice(100);

        System.out.println("Price for a single: $" + p.getPrice());

        System.out.println("Price based on quantity : $" +p.getPrice(10));
    }
}