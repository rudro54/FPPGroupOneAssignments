package lessonThree;

public class Main {
    public static void main(String[] args) {
        //Solution of Problem 1
        Customer customer1 = new Customer("Joe", "Smith", "332-221-4444");
        customer1.setBillingAddress(new Address("1 A St", "Chicago", "IL", "11111"));
        customer1.setShippingAddress(new Address("1 A St", "Chicago", "IL", "11111"));

        Customer customer2 = new Customer("Sudipto", "Roy", "354-221-5555");
        customer2.setBillingAddress(new Address("1 B St", "New Jersey", "NJ", "22222"));
        customer2.setShippingAddress(new Address("2 B St", "New Jersey", "NJ", "22222"));

        Customer customer3 = new Customer("Zayed", "Abdullah", "360-221-6666");
        customer3.setBillingAddress(new Address("1 C St", "Chicago", "IL", "11111"));
        customer3.setShippingAddress(new Address("1 C St", "Ottumwa", "IA", "52555"));

        Customer[] customers = {customer1, customer2, customer3};
        for (Customer customer : customers)
            if (customer.getBillingAddress().getCity().equals("Chicago"))
                System.out.println(customer);


        //Solution of Problem2
        //Code from here
    }
}
