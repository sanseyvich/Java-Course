package ua.artcode.week3.oop;

/**
 * Created by olsas on 3/6/2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ivan";
        st1.birth = "1990-03-23";
        st1.taskCount = 100;
        st1.rank = 3;

        Student st2 = new Student();
        st2.name = "Serhii";
        st2.birth = "1992-03-23";
        st2.taskCount = 80;
        st2.rank = 5;

        Student[] list = new Student[10];
        list[0] = st1;
        list[1] = st2;


    }
}
