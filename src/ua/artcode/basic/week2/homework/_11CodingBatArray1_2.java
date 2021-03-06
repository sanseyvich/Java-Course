package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/2/2016.
 * <p>
 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last
 * element are equal.
 * <p>
 * sameFirstLast({1, 2, 3}) → false
 * sameFirstLast({1, 2, 3, 1}) → true
 * sameFirstLast({1, 2, 1}) → true
 */
public class _11CodingBatArray1_2 {
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1] ? true : false;
    }
}
