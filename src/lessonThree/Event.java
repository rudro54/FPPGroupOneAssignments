package lessonThree;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Event {

    private String eventName;
    private LocalDateTime eventDateTime;


    public Event(String eventName, LocalDateTime eventDateTime){
        this.eventName=eventName;
        this.eventDateTime=eventDateTime;

    }

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getEventDateTime(){
        return eventDateTime;

    }

    public boolean isLeapYear(){

        return eventDateTime.toLocalDate().isLeapYear();

    }

    public long daysUntil(){
        LocalDate currentDate = LocalDate.now();
        LocalDate eventDate = eventDateTime.toLocalDate();
        Period period = Period.between(currentDate,eventDate);

        return (long)period.getYears()*365+ (long)period.getMonths()*30+ period.getDays();

    }

    public String formatEventDetails(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy@ HH:mm");
        ZoneId systemZone = ZoneId.systemDefault();
        ZonedDateTime zoneEventDateTime = eventDateTime.atZone(systemZone);

        return String.format(
            "%s [%s]",
                zoneEventDateTime.format(formatter),
                systemZone.getId()
                );
    }


    public String convertToTimeZone(String targetZoneId){
        try{
            ZoneId targetZone = ZoneId.of(targetZoneId);
            ZonedDateTime zonedEventDateTime = eventDateTime.atZone(ZoneId.systemDefault());
            ZonedDateTime convertedDateTime = zonedEventDateTime.withZoneSameInstant(targetZone);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy@ HH:mm");

            return String.format(
                    "%s [%s]",
                   convertedDateTime.format(formatter),
                    targetZoneId
            );


        }catch (Exception e){
            return  "Invalid time zone : "+targetZoneId;
        }
    }

    @Override
    public String toString() {
        return String.format("Event: %s on %s", eventName, formatEventDetails());
    }



}
