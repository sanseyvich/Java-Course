package ua.artcode.basic.utils;

/**
 * Created by olsas on 2/28/2016.
 */
public class ArrayUtils {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] generateArr(int size, int range) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNum(range);
        }
        return arr;
    }

    public static int getRandomNum(int range) {
        return (int) (Math.random() * range);
    }

    public static int[] generateEvenArr(int randomMax, int arrLength) {
        int[] array = new int[arrLength];
        for (int i = 0; i < array.length; i++) {
            int element = getRandomNum(randomMax);
            // ternary operations
            array[i] = element % 2 > 0 ? element + 1 : element;
        }
        return array;
    }

    public static int[] generateOddArr(int randomMax, int arrLength) {
        int[] array = new int[arrLength];
        for (int i = 0; i < array.length; i++) {
            int element = getRandomNum(randomMax);
            // ternary operations
            array[i] = element % 2 == 0 ? element + 1 : element;
        }
        return array;
    }

    public static String convertIntArrayToString(int[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString = arrayString + array[i] + ", ";
        }
        return arrayString;
    }

}
