package lessonFive.Problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double lightLevel;


    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        this.lastUpdated = LocalDateTime.now();
    }


    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        return lightLevel < 100 ? "An alert to turn on the light" : "Light is sufficient";
    }


    @Override
    public String toString() {
        return String.format("Sensor Type: %s\nReading: %.1f\nLocation: %s\nLast Updated: %s\nAction: %s",
                getSensorType(), getReading(), getLocation(), getLastUpdated(), performAction());
    }


    private String formatTime(LocalDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:a");
        return time.format(formatter);
    }
}
