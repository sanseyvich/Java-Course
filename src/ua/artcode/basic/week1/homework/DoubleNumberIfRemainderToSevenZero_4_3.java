package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class DoubleNumberIfRemainderToSevenZero_4_3 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Please input your number! ->");
        int number = stdinScanner.nextInt();
        if (number % 7 == 0) {
            number *= 2;
            System.out.println("Congratulations, your new number is " + number);
        } else {
            System.out.println("Sorry you're not lucky!!");
        }
    }
}
