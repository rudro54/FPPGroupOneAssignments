package lessonFive.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.temperature = temperature;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now(); // Update the field
        return lastUpdated;
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
    public String performAction() {
        if (temperature > 30) {
            return "an alert to turn on the AC";
        } else if (temperature < 18) {
            return "an alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: " + getSensorType() +
                "\nReading: " + getReading() +
                "\nLocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated().format(formatter) +
                "\nAction: " + performAction() + "\n";
    }
}
