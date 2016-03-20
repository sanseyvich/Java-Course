package ua.artcode.oop.week1.task.utils;

import ua.artcode.oop.week1.task.model.Student;

/**
 * Created by olsas on 3/19/2016.
 */
public class StudentUtils {
    public static String studentToString(Student st){
        if (st == null){
            return "null";
        }
        return String.format("name: %s, phone: %s, money: %.2f, birthYear: %d",
                st.name, st.phone, st.paidMoney, st.birthYear);
    }
}
