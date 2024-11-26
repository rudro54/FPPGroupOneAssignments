package lessonTwo;

public class Prog6 {
    public static void secondMin(int[] arrayOfInts){
        if(arrayOfInts.length<2){
            System.out.println("you must have two elements in array");
            return;
        }
        int min=Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int currentValue:arrayOfInts){
            if(currentValue<min){
                secondMin=min;
                min=currentValue;
            }
            else if(currentValue>min&&currentValue<secondMin){
                secondMin=currentValue;
            }
        }
        if(secondMin==Integer.MAX_VALUE){
            System.out.println("both the elements are same");
            return;
        }
        System.out.println(secondMin);
    }



    public static void main(String[] args) {
        secondMin(new int[]{2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
        secondMin(new int[]{21, 21});
        secondMin(new int[]{2});

    }
}
