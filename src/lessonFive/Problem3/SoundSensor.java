package lessonFive.Problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        this.lastUpdated = LocalDateTime.now();
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
        return soundLevel > 70 ? "An alert to turn on noise cancellation" : "Sound is within normal range";
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
