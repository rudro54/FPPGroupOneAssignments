package practice;

public class RecursionTest {
    public static void main(String[] args){
        countDown(3);
        System.out.println(length("abc"));
        printCharsReverse("abc");
        System.out.println(fact(3));
        xMethod(1234567);
        System.out.println("\n");
        System.out.println(fib(6));
    }
    public static void countDown(int num){
        if (num <=0){
            System.out.println();
        } else {
            System.out.print(num);
            countDown(num - 1);
        }
    }

    public static int length(String str) {
        if (str == null || str.equals(""))// base case
            return 0;
        else // Recursive case
            return 1 + length(str.substring(1));
    }

    public static void printCharsReverse(String str) {
        if (str == null || str.equals(""))
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    public static int fact(int num) {
        if(num == 0 || num == 1) { //base case
            return 1;
        }
        return num * fact(num-1);
    }

    public static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);
        }
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
