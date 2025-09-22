class Product {
    static double discount = 10.0; // Shared by all products
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Unique and final

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", ID: " + productID + ", Discount: " + discount + "%");
        }
    }
}

public class CartDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 301);
        Product p2 = new Product("Mouse", 1000, 2, 302);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15);
        p1.displayDetails();
    }
}

