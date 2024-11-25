package lessonTwo;

public class Prog2 {
    public static void main(String[] args) {
        float a = 1.27f, b = 3.881f, c = 9.6f;
        float sum = a + b + c;
        System.out.println( "Solution 1: " + (int) sum);
        System.out.println( "Solution 2: " + Math.round(sum));
    }
}
