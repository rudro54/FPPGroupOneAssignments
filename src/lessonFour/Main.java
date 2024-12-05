package lessonFour;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Solution 1
        System.out.println(power(2, 10));

        //Solution 2
        System.out.println(minimumCharacter("akel"));

        //Solution 3
        int [] arr = {1, 3, 5, 7, 9, 13};
        System.out.println(Arrays.toString(reverse(arr)));

        //Solution 4
        int n = 121;
        System.out.println(n + " is palindrome? " + (isPalindrome(n) ? "Yes" : "No"));

        //Solution 5
        System.out.println("Max = " + maxValue(new int[]{5, -3, 6, 1, 9, 4} ));

        //Solution 6: Please, check MainTest
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static char minimumCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        } else {
            char result = minimumCharacter(str.substring(1));
            if (result == '\0') {
                return str.charAt(0);
            } else {
                return result<str.charAt(0) ? result:str.charAt(0);
            }
        }
    }

    public static int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return reverseArray(arr, 0, arr.length - 1);
    }

    private static int[] reverseArray(int[] arr, int from, int to) {
        if (from > to) {
            return arr;
        }

        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;

        return reverseArray(arr, from+1, to-1);
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            return true;
        } else {
            return n == reversedNumber(n, 0);
        }
    }

    private static int reversedNumber(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        reverse = reverse*10 + n%10;
        return reversedNumber(n/10, reverse);
    }

    public static int maxValue(int [] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid or Empty Input, returning -1");
            return -1;
        }
        return maxElement(arr, 0, 0);
    }

    public static int maxElement(int[] arr, int start, int max) {
      if (start == arr.length) {
          return max;
      }
      int value = maxElement(arr, start+1, max);

      if (value > arr[start]) {
          return value;
      } else {
          return arr[start];
      }
    }

}
