package lesson5.problem6;

public class PersionTest {
    public static void main(String[] args) {
        // Create three Person objects
        Person alice = new PersonWithJob("Alice", 1000);
        Person alice2 = new PersonWithJob("Alice", 1500);
        Person alice3 = new PersonWithJob("Alice", 2000);

        // Print their names
        System.out.println("Person 1: " + alice.getName());
        System.out.println("Person 2: " + alice2.getName());
        System.out.println("Person 3: " + alice3.getName());

        // Check for equality
        System.out.println("Person 1 equals Person 2? " + alice.equals(alice2));
        System.out.println("Person 1 equals Person 3? " + alice.equals(alice3));
    }
}
