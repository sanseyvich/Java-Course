package ua.artcode.basic.week2;

/**
 * Created by olsas on 2/28/2016.
 */
public class LoopsExamples {
    public static void main(String[] args) {
        // array + loop
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0, val = array.length; i < array.length; i++, val--) {
            array[i] = val;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }

        // print all arr
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int lRange = 0;
        int rRange = 10;

        boolean way = true;
        for(int i = lRange; i >= lRange && i <= rRange; ){
            System.out.print(i + " ");
            if(i < rRange && way){
                i++;
            } else if(i == rRange) {
                way = false;
                i--;
            }else if(!way) {
                i--;
            }
        }
    }
}

