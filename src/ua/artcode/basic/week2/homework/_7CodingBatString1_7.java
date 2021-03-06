package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/2/2016.
 * <p>
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class _7CodingBatString1_7 {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
