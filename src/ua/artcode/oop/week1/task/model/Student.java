package ua.artcode.oop.week1.task.model;

/**
 * Created by olsas on 3/19/2016.
 */
public class Student {
    //has-a relation
    public String name;
    public String phone;
    public String email;

    public MyDate myDate = new MyDate();

    public double paidMoney;

    public String city;
    public String street;
    public String houseNum;

    public int taskCount;

    public String convertStudent(){
        return String.format("name: %s, phone: %s, money: %.2f, birthYear: %d",
                name, phone, paidMoney, myDate.birthDay);
    }

    public void init(String city, String name, String mail, double paidMoney) {
        this.name = name;
        this.city = city;
        this.email = mail;
        this.paidMoney = paidMoney;
    }
}
