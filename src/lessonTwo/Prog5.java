package lessonTwo;
import java.util.Arrays;
public class Prog5 {

    public static int[] combine(int[] a, int[] b){
        int combinedLength=a.length+b.length;
        int[] resultArray = new int[combinedLength];
        int counter=0;
        for(int first:a){
            resultArray[counter++]=first;
        }
        for(int second:b){
            resultArray[counter++]=second;
        }
        return  resultArray;
    };
    public static void main(String[] args) {

        int[] inputArrayA ={5,6,-4,3,1};
        int[] inputArrayB ={3,8,9,11};

        System.out.println(Arrays.toString(combine(inputArrayA,inputArrayB)));

    }
}
