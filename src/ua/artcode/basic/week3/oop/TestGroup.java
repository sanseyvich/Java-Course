package ua.artcode.basic.week3.oop;

import ua.artcode.basic.utils.GroupJsonUtils;

/**
 * Created by olsas on 3/6/2016.
 */
public class TestGroup {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Serhii";
        st1.birth = "1992-19-05";
        st1.taskCount = 100;
        st1.rank = 4;

        Student st2 = new Student();
        st2.name = "Ivan";
        st2.birth = "1990-20-03";
        st2.taskCount = 80;
        st2.rank = 5;

        Student[] list = new Student[10];
        list[0] = st1;
        list[1] = st2;

        Group myGroup = new Group();
        myGroup.groupName = "ACB14";
        myGroup.count = 10;
        myGroup.list = list;

        //debug next for better OOP understanding
        list[0] = null;


        String myGroupStringJson = GroupJsonUtils.toJson(myGroup);
        System.out.println(myGroupStringJson);
    }
}
