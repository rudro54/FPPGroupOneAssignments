package lessonTwo;

import java.util.random.RandomGenerator;

public class Prog1 {
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();

        int x = rand.nextInt(1,10);
        double piPowerOfX = Math.pow(Math.PI,x);
        System.out.printf("Solution 1: %.2f\n", piPowerOfX);

        int y = rand.nextInt(3,15);
        double yPowerOfX = Math.pow(y,x);
        System.out.printf("Solution 2: %.2f\n", yPowerOfX);
    }
}
