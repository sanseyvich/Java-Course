package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class NumberRangeChecker_4_4 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Please input number with <double> type ->");
        double number = stdinScanner.nextDouble();

        if (number >= 0.0 && number <= 1.0) {
            System.out.println("Your number is in range 0...1!");
        } else {
            number = -1.0;
            System.out.println("Your number is out of range 0...1");
        }
    }
}
