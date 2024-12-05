package lesson5.problem3;

import java.time.LocalDateTime;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    LocalDateTime getLastUpdated();
    String performAction();
}
