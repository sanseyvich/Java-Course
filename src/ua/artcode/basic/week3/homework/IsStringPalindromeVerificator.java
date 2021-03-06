package ua.artcode.basic.week3.homework;

/**
 * Created by olsas on 3/14/2016.
 * <p>
 * 3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class IsStringPalindromeVerificator {
    public static boolean isStringPalindrome(String string) {
        String firstHalf = string.substring(0, string.length() / 2);
        String secondHalf = string.substring(string.length() - firstHalf.length(), string.length());
        return firstHalf.equalsIgnoreCase(returnStringBackwards(secondHalf));
    }

    private static String returnStringBackwards(String string) {
        String editedString = "";
        char[] charOfOriginalString = string.toCharArray();
        for (int i = charOfOriginalString.length - 1; i >= 0; i--) {
            editedString += charOfOriginalString[i];
        }
        return editedString;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("PETroRtep"));
        System.out.println(isStringPalindrome("mothertom"));
    }
}
