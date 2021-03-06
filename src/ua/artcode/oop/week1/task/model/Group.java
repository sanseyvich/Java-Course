package ua.artcode.oop.week1.task.model;

/**
 * Created by olsas on 3/20/2016.
 */
public class Group {
    private Student[] groupContent;
    public int studentsCount;

    public Group(int groupSize) {
        groupContent = new Student[groupSize];
        studentsCount = 0;
    }

    public void addStudent(Student student) {
        groupContent[studentsCount] = student;
        studentsCount++;
    }

    public void deleteStudent(Student student) {
        for (Student st : groupContent) {
            st = st == student ? null : st;
        }
    }

    public String showAll() {
        String namePhone = "";
        for (int i = 0; i < groupContent.length; i++) {
            if (groupContent[i] != null) {
                namePhone += groupContent[i].convertStudent();
            }
        }
        return namePhone;
    }

    public Student search(int id) {
        return groupContent[id];
    }

}
