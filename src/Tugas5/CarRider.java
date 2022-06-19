package com.src.Tugas5;

public class CarRider{
    private String name;
    private int age;
    private String phone;

    CarRider(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPhone(){
        return phone;
    }
}
