package ua.artcode.basic.week2;

/**
 * Created by olsas on 2/28/2016.
 */
public class IncrementDecrementPostPre {
    public static void main(String[] args) {
        int c = 5;
        //postcrement has lower priority than assigning and others
        int a = c++; //after assigning c = 6
        //precrement has higher priority than assigning and others
        int b = ++c; //b = 6+1

        int d = 2;
        // (d = (2)) + d(2+1) = 5 + 1 = 6
        int res = d++ + ++d;

        System.out.println("res = " + res);

        System.out.println("a = " + a + " " + "b = " + b);

        System.out.println("c = " + c);

    }
}
