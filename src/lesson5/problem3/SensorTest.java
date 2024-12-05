package lesson5.problem3;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[] {
                new LightSensor("Class", 90.0),
                new SoundSensor("Hall Room", 80.0),
                new TemperatureSensor("Kitchen", 35),
                new TemperatureSensor("Bed Room", 15),
                new TemperatureSensor("Living Room", 28)
        };

        for (Sensor sensor : sensors) {
            System.out.println(sensor);
        }


    }
}
