package lessonFive.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double lightLevel;

    public LightSensor(String location, Double lightLevel) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.lightLevel = lightLevel;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public double getLightLevel() {
        return lightLevel;
    }
    public void setLightLevel(double lightLevel) {
        this.lightLevel = lightLevel;
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
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String performAction() {
        return lightLevel < 100.0 ? "an alert to turn on the light" : "Light is sufficient";
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
        return "Sensor Type: " + getSensorType() +
        "\nLocation: " + getLocation() +
        "\nReading: " + getReading() +
        "\nLast Updated: " + getLastUpdated().format(formatter) +
        "\nAction: " + performAction() + "\n";
    }
}
