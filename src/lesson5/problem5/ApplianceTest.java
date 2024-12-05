package lesson5.problem5;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[] {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };

        for (Appliance appliance : appliances) {
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
