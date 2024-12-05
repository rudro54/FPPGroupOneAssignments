package lesson5.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double soundLevel;


    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.soundLevel = soundLevel;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public double getSoundLevel() {
        return soundLevel;
    }
    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
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
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundLevel;
    }

    @Override
    public String performAction() {
        return soundLevel > 70 ? "an alert to turn on noise cancellation" : "Sound is within normal range";
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
