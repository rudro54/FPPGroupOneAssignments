package lessonFive.Problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double temperature;


    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.lastUpdated = LocalDateTime.now();
    }


    @Override
    public String getSensorType() {
        return "Temperature Sensor";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return formatTime(lastUpdated);
    }


    @Override
    public String performAction() {
        if (temperature > 30) {
            return "An alert to turn on the AC";
        } else if (temperature < 18) {
            return "An alert to turn on the heater";
        } else {
            return "Temperature is in normal range";
        }
    }


    @Override
    public String toString() {
        return String.format("Sensor Type: %s\nReading: %.1f\nLocation: %s\nLast Updated: %s\nAction: %s",
                getSensorType(), getReading(), getLocation(), getLastUpdated(), performAction());
    }

    private String formatTime(LocalDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return time.format(formatter);
    }


}
