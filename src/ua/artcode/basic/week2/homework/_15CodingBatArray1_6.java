package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/4/2016.
 * <p>
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
 * Both arrays will be length 1 or more.
 * <p>
 * commonEnd({1, 2, 3}, {7, 3}) → true
 * commonEnd({1, 2, 3}, {7, 3, 2}) → false
 * commonEnd({1, 2, 3}, {1, 3}) → true
 */
public class _15CodingBatArray1_6 {
    public boolean commonEnd(int[] a, int[] b) {
        int aLastIndex = a.length - 1;
        int bLastIndex = b.length - 1;
        return a[0] == b[0] || a[aLastIndex] == b[bLastIndex] ? true : false;
    }
}
