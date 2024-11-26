package lessonTwo;

import java.util.Arrays;

public class Prog5 {
    public static int[] combine(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int counter = 0;
        for(int each: a)
            c[counter++] = each;

        for(int each: b)
            c[counter++] = each;
        return c;
    }

    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        System.out.println(Arrays.toString(combine(a, b)));
    }
}
