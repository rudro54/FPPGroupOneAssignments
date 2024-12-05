package lesson5.problem1;

public class Clothing extends Product {
    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        if(discountPercentage < 0 || discountPercentage > 100) {
            return super.getPrice();
        }
        double originalPrice = super.getPrice();
        double discount = originalPrice * (discountPercentage / 100);
        return originalPrice - discount;
    }

    @Override
    public String toString() {
        return  "Name: " + super.getProductName() + " Price: " + super.getPrice() + " Brand: " + brand + " Discount: " + discountPercentage;
    }
}
