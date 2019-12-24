package com.example.hello.Bean;

import java.io.Serializable;

public class MyClass implements Serializable {
    private String Name;
    private String ID;
    private int Age;

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public  MyClass(String name, String id, int age){
        this.Age=age;
        this.ID=id;
        this.Name=name;
    }

}
