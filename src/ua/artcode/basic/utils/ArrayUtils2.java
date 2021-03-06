package ua.artcode.basic.utils;

import java.util.Arrays;

/**
 * Created by olsas on 3/5/2016.
 * Container for methods used for manipulations over arrays
 */
public class ArrayUtils2 {
    public static void main(String[] args) {
        //identifyMinMaxValues test
        int[] testIdentifyMinMaxValues = ArrayUtils.generateArr(5, 8);
        System.out.println("Test identifyMinMaxValues = " + Arrays.toString(testIdentifyMinMaxValues));
        identifyMinMaxValues(testIdentifyMinMaxValues);
        //changeMinMaxElements test
        int[] testChangeMinMaxElements = ArrayUtils.generateArr(8, 9);
        System.out.println("Test changeMinMaxElements before = " + Arrays.toString(testChangeMinMaxElements));
        changeMinMaxElements(testChangeMinMaxElements);
        System.out.println("Test changeMinMaxElements after = " + Arrays.toString(testChangeMinMaxElements));
        //copyFirstToSecondArray test
        int[] testCopyFirstToSecondArray_1 = ArrayUtils.generateArr(9, 10);
        int[] testCopyFirstToSecondArray_2 = ArrayUtils.generateArr(9, 10);
        System.out.println("Test copyFirstToSecondArray \nfirst array before " + Arrays.toString(testCopyFirstToSecondArray_1));
        System.out.println("second array before " + Arrays.toString(testCopyFirstToSecondArray_2));
        copyFirstToSecondArray(testCopyFirstToSecondArray_1,testCopyFirstToSecondArray_2);
        System.out.println("first array after " + Arrays.toString(testCopyFirstToSecondArray_1));
        System.out.println("second array after " + Arrays.toString(testCopyFirstToSecondArray_2));
        //numberAmountInArray test
        int[] testNumberAmountInArray = ArrayUtils.generateArr(10, 10);
        int number = testNumberAmountInArray[6];
        int appearance = numberAmountInArray(number,testNumberAmountInArray);
        System.out.println("Test numberAmountInArray \nArray " + Arrays.toString(testNumberAmountInArray));
        System.out.println("Number " + number);
        System.out.println("Appearance = " + appearance);
    }

    /*
     * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
     */
    public static void identifyMinMaxValues(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    /*
     * Поменять местами наибольший и наименьший элементы в массиве
     */
    public static void changeMinMaxElements(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[i];
            }
            if (arr[i] < min) {
                minIndex = i;
                min = arr[i];
            }
        }
        arr[minIndex] = max;
        arr[maxIndex] = min;
    }

    /*
     * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
     * */
    public static void copyFirstToSecondArray (int[] fromArr, int[] toArr){
        for (int i = 0; i < toArr.length; i++) {
            toArr[i] = fromArr[i];
        }
    }

    /*
    * Посчитать сколько цифр(цифра задается пользователем) в массиве
    * */
    public static int numberAmountInArray(int number, int[] arr) {
        int appearance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                appearance++;
            }
        }
        return appearance;
    }
}
