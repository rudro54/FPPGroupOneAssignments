package lesson3;

public record Circle(double radius) {
    public Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
