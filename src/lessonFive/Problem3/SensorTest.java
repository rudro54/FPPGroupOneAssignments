package lessonFive.Problem3;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];

        sensors[0] = new LightSensor("BackYard", 80.0);
        sensors[1] = new SoundSensor("Reading Room", 65.0);
        sensors[2] = new TemperatureSensor("Kitchen", 23.5);
        sensors[3] = new LightSensor("Toilet", 120.0);
        sensors[4] = new TemperatureSensor("Garage", 35);

        for(Sensor sensor:sensors){
            System.out.println(sensor);
            System.out.println("---------------------");
        }
    }
}
