package lessonThree;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private String name;
    private ZonedDateTime date;

    public Event(String name, ZonedDateTime date) {
        this.name = name;
        this.date = date;
    }

    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getDate() {
        return date;
    }
    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    //Methods
    public void displayDay() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE");
        String formattedDate = date.format(format);
        System.out.println("Event is on: " + formattedDate);
    }

    public void checkLeapYear() {
        boolean isLeapYear = Year.isLeap(date.getYear());
        System.out.println("Is leap year? " + (isLeapYear ? "Yes!" : "No"));
    }

    public void daysRemaining() {
        ZonedDateTime now = ZonedDateTime.now();
        long daysUntilEvent = ChronoUnit.DAYS.between(now.toLocalDate(), date.toLocalDate());
        System.out.println("Days until the event: " + daysUntilEvent);
    }

    public void displayFormattedEventDetails() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm '['VV']'");
        String formattedDate = date.format(format);
        System.out.println("Event Details: " + formattedDate);
    }

    public void convertToTimeZone(String targetTimeZone) {
        try {
            ZoneId targetZoneId = ZoneId.of(targetTimeZone);
            ZonedDateTime convertedDateTime = date.withZoneSameInstant(targetZoneId);
            DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [z]");
            System.out.println("Event Details: " + targetTimeZone + ": " + convertedDateTime.format(format));
        } catch (Exception e) {
            System.out.println("Unsupported time zone");
        }
    }


    @Override
    public String toString() {
        return "Event [name=" + name + ", date=" + date + "]";
    }
}
