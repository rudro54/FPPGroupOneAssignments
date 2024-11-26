package lessonTwo;

public class Prog6 {
    public static void secondMin(int[] arrayOfInts) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int each: arrayOfInts) {
            if (each < min) {
                secondMin = min;
                min = each;
            } else if (min < each && each < secondMin) {
                secondMin = each;
            }
        }

        System.out.println(secondMin);
    }

    public static void main(String[] args) {
        int[] array = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(array);
    }
}
