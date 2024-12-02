package lessonThree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String firstName = sc.nextLine();
        System.out.println("Please, enter your last name:");
        String lastName = sc.nextLine();
        System.out.println("Please, enter your birth date in the format - (yyyy-MM-dd) - Example: 1989-4-14");
        String birthDateStringValue = sc.nextLine();
        DateTimeFormatter formatterMM = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("yyyy-M-dd");

        LocalDate birthDate = null;
        try {
            birthDate = LocalDate.parse(birthDateStringValue, formatterMM);
        } catch(Exception _) {
            try {
                birthDate = LocalDate.parse(birthDateStringValue, formatterM);
            } catch(Exception _) {
                System.out.println("Unsupported date format");
                return;
            }
        }

        HeartRates heartRate = new HeartRates(firstName, lastName, birthDate);
        heartRate.targetHeartRateRange();
        System.out.println(heartRate);

        //Solution of Problem3
        //1.a
        System.out.println("Please, enter event name: ");
        String eventName = sc.nextLine();

        System.out.println("Please, enter event date (yyyy-MM-dd): ");
        String eventDateStringValue = sc.nextLine();

        System.out.println("Please, enter event time (HH:mm): ");
        String eventTimeStringValue = sc.nextLine();

        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateStringValue + "T" + eventTimeStringValue);
        ZonedDateTime eventZonedDateTime = eventDateTime.atZone(ZoneId.systemDefault());

        Event event = new Event(eventName, eventZonedDateTime);
        //1.b
        event.displayDay();
        event.checkLeapYear();
        //1.c
        event.daysRemaining();
        //2.a
        event.displayFormattedEventDetails();
        //3.a
        System.out.println("Sample Time Zones: America/Panama, America/Chicago, America/Indiana/Indianapolis, America/Santiago, America/Phoenix");
        System.out.print("Enter the target time zone: ");
        String targetTimeZone = sc.nextLine();
        event.convertToTimeZone(targetTimeZone);

        //Solution of Problem4
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String choice = sc.nextLine().toUpperCase();
        switch (choice) {
            case "C" -> {
                System.out.println("Enter the radius of the Circle:");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf("The area of Circle is: %.2f%n", circle.computeArea());
            }
            case "R" -> {
                System.out.println("Enter the width of the Rectangle:");
                double width = sc.nextDouble();
                System.out.println("Enter the height of the Rectangle:");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.printf("The area of Rectangle is: %.2f%n", rectangle.computeArea());
            }
            case "T" -> {
                System.out.println("Enter the base of the Triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle:");
                double height = sc.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.printf("The area of Triangle is: %.2f%n", triangle.computeArea());
            }
            default -> System.out.println("Unsupported format");
        }

        //Solution of Problem5: Run PizzaTest Class
    }


}
