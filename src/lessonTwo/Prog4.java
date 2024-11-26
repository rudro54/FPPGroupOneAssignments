package lessonTwo;

import java.util.Arrays;

public class Prog4 {

    public static void main(String[] args) {
        String[] givenArray = {"horse", "dog", "cat","horse","dog"};
        String[] newArray = new String[givenArray.length];
        boolean matched = false;
        int counter = 0;

        for (String givenElement : givenArray) {
            for (String newElement : newArray)
                if (givenElement.equals(newElement)) {
                    matched = true;
                    break;
                }
            if (!matched) {
                newArray[counter++] = givenElement;
            }
        }

        String[] resultArray = new String[counter];
        System.arraycopy(newArray, 0, resultArray, 0, counter);

        System.out.println(Arrays.toString(resultArray));


    }






}
