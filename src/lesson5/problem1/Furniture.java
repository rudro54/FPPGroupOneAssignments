package lesson5.problem1;

public class Furniture extends  Product{
    private double materialCost;
    private double shippingCost;
    public Furniture(String productName, double price, double materialCost, double shippingCost) {
        super(productName, price);
        this.materialCost = materialCost;
        this.shippingCost = shippingCost;
    }
    public double getMaterialCost() {
        return materialCost;
    }
    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }
    public double getShippingCost() {
        return shippingCost;
    }
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return  super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return  "Name: " + super.getProductName() + " Price: " + super.getPrice() + " Material Cost: " + materialCost + " Shipping cost: " + shippingCost;
    }
}
