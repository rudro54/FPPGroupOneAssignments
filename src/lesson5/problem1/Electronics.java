package lesson5.problem1;

public class Electronics extends Product{
    private boolean warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, boolean warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }
    public void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }
    public boolean isWarranty() {
        return warranty;
    }
    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    @Override
    public double getPrice() {
        if (!warranty) {
            return super.getPrice();
        }
        return  super.getPrice() + warrantyCost;
    }
    @Override
    public String toString() {
        return  "Name: " + super.getProductName() + " Price: " + super.getPrice() + " Warranty: " + warranty + " Warranty cost: " + warrantyCost;
    }
}
