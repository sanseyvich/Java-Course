package ua.artcode.oop.week1.task.model;

/**
 * Created by serhii on 19.03.16.
 */
public class Student {

    // fields, properties
    // has-a
    private String name;

    private String phone;
    private String email = "none";
    private MyDate myDate;

    private Adress address;

    private double paidMoney;
    private int taskCount;

    /*// return this
    public Student(){
        System.out.println("Default constructor");
    }
    public Student(String phone){
        this.phone = phone;
    }*/

    public Student(String name, String phone, String email, MyDate myDate,
                   Adress address, double paidMoney, int taskCount) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.myDate = myDate;
        this.address = address;
        this.paidMoney = paidMoney;
        this.taskCount = taskCount;
    }

    public String convertStudent(){

        // "name %s, phone %s, money %.2f, birthYear %d",
        return String.format("name %s, phone %s, money %.2f, birthYear %d",
                name, phone, paidMoney, myDate.birthYear);
    }

    // getName(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.out.println("wrong input name");
            return;
        }
        this.name = name;
    }

    public Adress getAddress(){
        return address;
    }

}