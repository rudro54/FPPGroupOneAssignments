package lessonThree;

public class Pizza {
    private final PizzaSize size;
    private final PizzaType type;
    private final int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        double sizePrice = switch (size) {
            case SMALL -> size.getSizePrice();
            case MEDIUM -> size.getSizePrice();
            case LARGE -> size.getSizePrice();
        };
        double typePrice = switch (type) {
            case VEGGIE -> type.getTypePrice();
            case PEPPERONI -> type.getTypePrice();
            case CHEEZE -> type.getTypePrice();
            case BBQ_CHICKEN -> type.getTypePrice();
        };
        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double tax = 0.03 * price;
        double totalPrice = price + tax;
        return String.format("""
                Pizza Order:
                Size: %s
                Type: %s
                Qty: %d
                Price: $%.2f
                Tax: $%.2f
                Total Price: $%.2f
                """, size, type, quantity, price, tax, totalPrice);
    }


}
