package lessonFive.Problem1;

public class Clothing extends Product {

    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }


    @Override
    public double calculatePrice() {
        return getPrice() * (1 - discountPercentage / 100);
    }


    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Discounted Price: " +String.format("%.2f", calculatePrice());
    }
}
