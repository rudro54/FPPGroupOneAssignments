package lessonThree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRatesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = scanner.nextLine();

        System.out.println("Enter Your Last Name");
        String lastName = scanner.nextLine();

        System.out.println("Enter Your Date Of Birth (yyyy-MM-dd) :");
        String dob = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

         HeartRates heartRates = new HeartRates(firstName,lastName,dateOfBirth);

        System.out.println(heartRates);
        scanner.close();


    }


}
