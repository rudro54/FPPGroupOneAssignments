package lessonFive.Problem1;

public class Electronics extends Product {
    private int monthsOfWarranty;
    private double warrantyCost;


    public Electronics(String productName, double price, int monthsOfWarranty, double warrantyCost) {
        super(productName, price);
        this.monthsOfWarranty = monthsOfWarranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double calculatePrice() {
        return getPrice() + warrantyCost;
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + monthsOfWarranty + " months, Final Price: " +String.format("%.2f", calculatePrice());
    }
}
