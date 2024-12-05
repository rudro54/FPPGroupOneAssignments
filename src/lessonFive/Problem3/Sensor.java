package lessonFive.Problem3;

interface Sensor {
    String getSensorType();

    double getReading();

    String getLocation();

    String getLastUpdated();

    String performAction();
}
