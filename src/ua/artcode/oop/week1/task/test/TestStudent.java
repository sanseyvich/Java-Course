package ua.artcode.oop.week1.task.test;

import ua.artcode.oop.week1.task.model.Student;
import ua.artcode.oop.week1.task.utils.StudentUtils;

/**
 * Created by olsas on 3/19/2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.city = "Kyiv";
        student1.name = "Sasha";
        student1.email = "tst@tst.tst";
        student1.paidMoney = 4000;
        student1.init ("Kyiv", "Petro", "tst1@tst.tst", 4000.06);

        System.out.println(StudentUtils.studentToString(student1));
        System.out.println(student1.convertStudent()); //better OOP approach
    }


}
