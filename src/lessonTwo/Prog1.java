package lessonTwo;

import java.util.Random;
import java.util.random.RandomGenerator;

public  class Prog1 {


    public static void main(String[] args) {

        System.out.println("number one");

        Random random = new Random();

        int randomNumber = random.nextInt(1,10);

//        System.out.println(randomNumber);
        double result =  Math.pow(Math.PI,randomNumber);


        System.out.println("the random number was "+randomNumber+" and the result "+result);


        System.out.println("number two");
        System.out.println("using printf");
        System.out.printf("%.2f",result);
        System.out.println();

       RandomGenerator randomTwo =  RandomGenerator.getDefault();

       int y = randomTwo.nextInt(3,15);

       double resultTwo = Math.pow(y,randomNumber);

        System.out.println("the random number was "+y+ " and the result "+resultTwo);
        System.out.println("using printf");
        System.out.printf("%.2f",resultTwo);
        System.out.println();










    }


}
