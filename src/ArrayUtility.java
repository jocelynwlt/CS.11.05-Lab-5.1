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
        double decimal = dadd/len;

        double output = Math.floor(decimal * 100) / 100;
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
        int count = 0;
        for (int i : array){
            if (i%2==0){
                count++;
            }
        }
        return count;
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
        int len = array.length;
        int left = 0;
        int right = array.length-1;

        while(left<right){
            int temp = array[left];
            array[left]=array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i:array){
            if(i==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {


        int slen = str.length();
        int len = array.length;
        String string = "";

        for (int i =0; i<len; i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;


    }

    public static void multiplyByTwo(int[] array) {
        int len = array.length;
        for(int i=0; i<len; i++){
            int times = array[i]*2;
            array[i]= times;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        int len = array.length;
        for(int i=0; i<len; i++){
            int times = array[i]*n;
            array[i]= times;
        }
    }

    public static String toString(int[] array) {
        int len = array.length;
        String output = "";
        for(int i=0; i<len; i++){
            output+=array[i];
            if(i!=len-1){
                output += ", ";
            }
        }
        return output;
    }

    public static boolean twoSum(int[] array, int num) {
        int len = array.length;
        for (int i =0; i<len-1; i++){
            for(int a =i+1; a<len; a++){
                if(array[i]+array[a]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int len = array.length;
        int last = array[len - 1];

        for (int i = len - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int len = array.length;
        int first = array[0];

        for (int i = 1; i<len; i++) {
            array[i-1] = array[i];
        }
        array[len-1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int len = array.length;
        n=n%len;
        int [] temp = new int [n];
        for(int i =0; i<n; i++){
            temp[i]=array[len-n+i];
        }

        for (int i = len - 1; i >=n; i--) {
            array[i] = array[i - n];
        }
        for(int i =0; i<n; i++){
            array[i]=temp[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int len = array.length;
        n = n % len;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }

        for (int i = n; i < len; i++) {
            array[i - n] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[len - n + i] = temp[i];
        }






    }


}
