import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public static int sum(int[] array) {
        int output = 0;
        int len = array.length;
        for (int i : array) {
            output += i;
        }
        return output;
    }

    public static double average(int[] array) {
        int add = 0;
        int len = array.length;
        for (int i : array) {
            add += i;
        }
        double dadd = (int)add;
        double lent = (int)len;
        double output = dadd/len;
        return output;
    }

    public static int minimum(int[] array) {
        int len = array.length;
        int num = array[0];
        for(int i = 0; i<len; i++){
            if(array[i]<num){
                num = array[i];
            }
        }
        return num;
        
    }

    public static int maximum(int[] array) {
        int len = array.length;
        int num = array[0];
        for(int i = 0; i<len; i++){
            if(array[i]>num){
                num = array[i];
            }
        }
        return num;
    }

    public static int evenCount(int[] array) {
        return 0;
    }

    public static int[] reverseOne(int[] array){
        int len = array.length;
        int[] output = new int[len];
        for (int i = 0; i<len; i++){
            output[i]=array[len-1-i];
        }
        return output;
    }



    public static void reverseTwo(int[] array) {


    }

    public static boolean linearSearchInt(int[] array, int num) {
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        return false;
    }

    public static void multiplyByTwo(int[] array) {

    }

    public static void multiplyByN(int[] array, int n) {

    }

    public static String toString(int[] array) {
        return null;
    }

    public static boolean twoSum(int[] array, int num) {
        return false;
    }

    public static void shiftRight(int[] array) {

    }

    public static void shiftLeft(int[] array) {

    }

    public static void shiftRightNTimes(int[] array, int n) {

    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
