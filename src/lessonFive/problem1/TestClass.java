package lessonFive.problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Electronics("Pelnois Humidifier", 24.99, false, 0),
                new Electronics("Macbook Pro", 1499, true, 99),
                new Furniture("Dresser", 150, 0, 5),
                new Clothing("Winter Jacket", 130, "Columbia", 30),
                new Clothing("Gloves", 17, "Dickies", 0)
        };

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.printf("Total price: %.2f\n", sumProducts(products));
    }

    public static double sumProducts(Product[] products) {
        if (products == null || products.length == 0) return 0;
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
}
