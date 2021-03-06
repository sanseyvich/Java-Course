package ua.artcode.basic.utils;

import ua.artcode.basic.week3.oop.Group;
import ua.artcode.basic.week3.oop.Student;

/**
 * Created by olsas on 3/6/2016.
 */
public class GroupJsonUtils {
    public static String toJson(Group group) {
        String outputJson = String.format("{\"groupName\": \"%s\",\"count\": %d,\"list\":[%s]}",
                group.groupName, group.count, arrayToJson(group.list));
        return outputJson;
    }

    public static String studentToJson(Student student) {
        String outputJson = String.format("{\"name\": \"%s\",\"birth\": \"%s\",\"taskCount\": %d,\"rank\": %d,}",
                student.name, student.birth, student.taskCount, student.rank);
        return outputJson;
    }

    public static String arrayToJson(Student[] arr) {
        String outputString = "";
        for (Student student : arr) {
            outputString += student != null ? studentToJson(student) + "" : "";
        }
        outputString = outputString.endsWith(",") ? outputString.substring(0,outputString.length() - 1) : outputString;
        return outputString;
    }
}
