package ua.artcode.basic.week2;

/**
 * Created by olsas on 2/27/2016.
 */
public class StringMethods {
    public static void main(String[] args) {
        //it is possible to convert char array to string by passing array to String object constructor
        //it is possible to cinvert String to char array by just using .toCharArray() method
        char[] seq = {'t', 's', 't'};
        String seq2 = "tst";
        char[] seq2_to_chars = seq2.toCharArray();
        String seq2_to_chars_back_to_string = new String(seq2_to_chars);

        System.out.println("seq " + seq + "  seq2 " + seq2 + "  seq2_to_chars " + seq2_to_chars
                + "  seq2_to_chars_back_to_string " + seq2_to_chars_back_to_string);

        //.length() method
        String str1 = "some text 123 word";
        int len = str1.length();
        System.out.println("count of symbols = " + len);

        //char at index position in a String
        int index = 3;
        char c = str1.charAt(index);
        System.out.println("char at " + index + " index = " + c);

        //.substring() method. Second parameter is length of new String
        String splited = str1.substring(0, 4);
        System.out.println("substring from [0,4) = " + splited);

        //.contains() method
        boolean res = str1.contains("123");
        System.out.println("str contains 123 = " + res);

        //index of char in a String
        int pos = str1.indexOf('x');
        System.out.println("Pos of x = " + pos);
    }
}
