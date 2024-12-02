package lessonThree;

public class Pizza {

    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;


    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();

    }


    private void calculatePrice() {
        double sizeWisePrice = switch (size) {
            case SMALL -> 8.0;
            case MIDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typeWisePrice = switch (type) {
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2.0;
            case CHEEZE -> 1.5;
            case BBQ_CHICKEN -> 2.0;
        };

        this.price = (sizeWisePrice + typeWisePrice) * quantity;

    }

    public String printOrderSummary() {
        double tax = price * .03;
        double totalPrice = price + tax;

        return String.format(
                "Pizza Order :\n Size : %s\nType : %s\n Qty: %s\n Price: %.2f\n tax :%.2f\n Total Price :%.2f", size, type, quantity, price, tax, totalPrice);

    }

}
