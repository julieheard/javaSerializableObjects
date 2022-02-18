package com.julie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Poppy", "Julie", 9, LocalDate.of(2022, 01, 9));
        System.out.println(cat.toString());
        serializeObject(cat);
        Animal animal = deserializeObject();
        System.out.println(animal.toString());
    }


    public static void serializeObject(Animal animal){
        try{
            FileOutputStream FS = new FileOutputStream(System.getProperty("user.dir")+"/tmp/Animal.ser");
            ObjectOutputStream out = new ObjectOutputStream(FS);
            out.writeObject(animal);
            out.close();
            FS.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }


    public static Animal deserializeObject(){
        Animal animal = new Animal();
        try{
            FileInputStream FIS = new FileInputStream(System.getProperty("user.dir")+"/tmp/Animal.ser");
            ObjectInputStream in = new ObjectInputStream(FIS);
            animal = (Animal) in.readObject();
            in.close();
            FIS.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return animal;
    }

}
