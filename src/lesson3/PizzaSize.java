package lesson3;

public enum PizzaSize {
    SMALL(8),
    MEDIUM(10),
    LARGE(12);

    private final double sizePrice;

    PizzaSize(double sizePrice) {
        this.sizePrice = sizePrice;
    }

    public double getSizePrice() {
        return sizePrice;
    }
}
