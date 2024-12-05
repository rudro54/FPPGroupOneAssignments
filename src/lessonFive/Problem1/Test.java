package lessonFive.Problem1;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Clothing("Hoodie", 157.99, "The North Face", 10.00);
        products[1] = new Furniture("Gaming Chair", 249.99, "Carbon Fiber", 15.50);
        products[2] = new Electronics("Electric Kettle", 11.99, 24, 3.50);
        products[3] = new Clothing("Jacket", 889.99, "Arc'teryx", 50);
        products[4] = new Furniture("Table", 149.99, "metal", 10.00);

        for (Product product : products) {
            System.out.println(product);
        }

        double totalSum = sumOfProducts(products);
        System.out.println("Total Sum Of Products :" + String.format("%.2f", totalSum));

    }


    public static double sumOfProducts(Product[] collection) {
        double sum = 0.0;

        if (collection != null) {
            for (Product product : collection) {
                if (product != null) {
                    sum += product.calculatePrice();
                }
            }
        }
        return sum;
    }

}
;