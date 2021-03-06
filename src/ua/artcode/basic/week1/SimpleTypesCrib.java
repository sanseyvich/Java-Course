package ua.artcode.basic.week1;

import java.io.PrintWriter;

/**
 * Created by olsas on 2/21/2016.
 */
public class SimpleTypesCrib {
    public static void main(String[] args) {
        //show arguments Ctrl + P
        int a = 1_000_000;
        double b = 3.14;
        float c = 3.14f;
        int d = 0b0011;
        byte e = 10;
        float f = 0b001;
        char g = 65; //Character code (decimal) - symbol constant
        char h = '\u2122'; //Unicode character code (in hexadecimal) - symbol constant
        double doubleDividedByZero = b / 0;
        // int intDevidedByZero = a / 0;  - java.lang.ArithmeticException: / by zero Exception
        int fouthBitFromRight = (7 & 8) / 8;
        int bitwiseShift = (0b11001111 >>> 4); //unsigned bitwise shift, shifted to 4 bits right so that bitwiseShift = 0b00001100
        int doubleToInt = (int) b;   //just cuts fractional for rounding use Math.round()

        double i = 11 + 5.6 + 5.8; //it won't give precise number. Because double like 5.6, 5.8 etc. has no exact representation in binary

        try {
            PrintWriter printWriter = new PrintWriter("test.txt");
            printWriter.println("test");
        } catch (Exception E) {
            System.out.println(E);
        }

        String firstPart = "Lol";
        String secondPart = "Vapshe";
        StringBuilder bothParts = new StringBuilder();
        bothParts.append(firstPart);
        bothParts.append(secondPart);
        System.out.println("StringBuilder is useful for associations =" + bothParts.toString());

        System.out.printf("This is the test of %s method. So going to show second parameter as decimal " +
                        "with delimiter - %2$,d and hexadecimal - %2$x\n",
                "printf", 100500);

        System.out.println("a = " + a +
                "\nb = " + b
                + "\nc = " + c
                + "\nd = " + d
                + "\ne = " + e
                + "\nf = " + f
                + "\ng = " + g
                + "\nh = " + h
                + "\nb / 0 = " + doubleDividedByZero
                + "\nfouth Bit From Right = " + fouthBitFromRight
                + "\nbitwise shift = " + bitwiseShift
                + "\ndouble to int = " + doubleToInt
                + "\ni = " + i);
    }
}
