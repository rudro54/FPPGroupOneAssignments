package lessonThree;

import lessonThree.Customer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Address addressOne = new Address("123 street", "New York", "NY", "1234");
        Address addressTwo = new Address("456 street", "Chicago", "IL", "4567");
        Address addressThree = new Address("789 street", "Chicago", "IL", "1234");
        Address addressFour = new Address("999 street", "Chicago", "IL", "4567");

        Customer customerOne = new Customer("Zayed", "Abdullah", "1234");
        customerOne.setBillingAddress(addressOne);
        customerOne.setShippingAddress(addressTwo);
        Customer customerTwo = new Customer("Sudipto", "Roy", "4567");
        customerTwo.setBillingAddress(addressThree);
        customerTwo.setShippingAddress(addressFour);
        Customer customerThree = new Customer("Ritesh", "Gyerre", "9999");
        customerThree.setBillingAddress(addressFour);
        customerThree.setShippingAddress(addressTwo);
        Customer customerFour = new Customer("Zyva", "Zayed", "1111");
        customerFour.setBillingAddress(addressOne);
        customerFour.setShippingAddress(addressTwo);

        Customer[] customers = {customerOne, customerTwo, customerThree, customerFour};

        System.out.println("Customers With Chicago Billing Address :");

        for (Customer customer : customers) {
            if ("Chicago".equals(customer.getBillingAddress().getCity())) {
                System.out.println(customer);
            }
        }


    }
}
