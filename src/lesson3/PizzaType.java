package lesson3;

public enum PizzaType {
    VEGGIE(1),
    PEPPERONI(2),
    CHEEZE(1.5),
    BBQ_CHICKEN(2);

    private final double typePrice;

    PizzaType(double typePrice) {
        this.typePrice = typePrice;
    }

    public double getTypePrice() {
        return typePrice;
    }
}
