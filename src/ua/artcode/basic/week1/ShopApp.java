package ua.artcode.basic.week1;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        //create variable, reate scanner, tell scanner about console
        Scanner sc = new Scanner(System.in);

        System.out.println("Input time!");
        int time = sc.nextInt();
        System.out.println("Input money!");
        double money = sc.nextDouble();
        System.out.println("Input price! (double)");
        double productPrice = sc.nextDouble();
        System.out.println("Input name!");
        String name = sc.next();
        System.out.println("Input product name!");
        String productName = sc.next();
        System.out.println("Input your energy! (true or false)");
        boolean energy = sc.nextBoolean();


        boolean timeLogicRes = !(time >= 24 && time < 8);
        boolean moneyLogicRes = money >= productPrice;

        boolean finalResult = timeLogicRes && moneyLogicRes && energy;

        String resultMessage = "Have you bought " + productName
                + " with price " + productPrice + "?\n"
                + finalResult;

        System.out.println(resultMessage);

    }
}