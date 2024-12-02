package lessonThree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the event name: ");
        String eventName = scanner.nextLine();

        System.out.print("Enter the event date and time (yyyy-MM-dd HH:mm): ");
        String eventDateTimeInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateTimeInput, formatter);


        Event event = new Event(eventName, eventDateTime);


        System.out.println("\nEvent Details:");
        System.out.println(event);


        System.out.printf("Is the event year a leap year? %s\n", event.isLeapYear() ? "Yes" : "No");


        System.out.printf("Days until the event: %d days\n", event.daysUntil());


        System.out.print("\nEnter a target time zone (e.g., America/Chicago): ");
        String targetTimeZone = scanner.nextLine();
        System.out.println("Event in target time zone:");
        System.out.println(event.convertToTimeZone(targetTimeZone));

        scanner.close();

    }
}
