package lessonTwo;

import java.util.Random;

public class Prog2 {

    public static void main(String[] args) {

      float a=1.27f;
      float b=3.881f;
      float c=9.6f;

      float summation = a+b+c;

      int sum = (int)summation;

        System.out.println("before changing "+summation);
        System.out.println("after type casting the sum is "+sum);

        System.out.println("rounding up using math dot round "+Math.round(summation));




    }
}
