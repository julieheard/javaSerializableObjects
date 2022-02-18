package com.julie;

import java.io.Serializable;
import java.time.LocalDate;

public class Animal implements Serializable {
    public String name;
    public String owner;
    public int age;
    public transient LocalDate dateLastSeen; //Transient variables cannot be serialised so when deserialised will be null values

    public Animal(String name, String owner, int age, LocalDate dateLastSeen) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.dateLastSeen = dateLastSeen;
    }

    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", dateLastSeen=" + dateLastSeen +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateLastSeen() {
        return dateLastSeen;
    }

    public void setDateLastSeen(LocalDate dateLastSeen) {
        this.dateLastSeen = dateLastSeen;
    }
}


