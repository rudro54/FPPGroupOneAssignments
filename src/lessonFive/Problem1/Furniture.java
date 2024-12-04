package lessonFive.Problem1;

public class Furniture extends Product {

    private String material;
    private double shippingCost;

    public Furniture(String productName, double price,String material, double shippingCost){
        super(productName,price);
        this.material=material;
        this.shippingCost=shippingCost;

    }

    @Override
    public double calculatePrice() {
       return getPrice()+shippingCost;
    }


    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + ", Final Price: " +String.format("%.2f", calculatePrice());
    }
}
