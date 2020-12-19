package com.demo.serializable;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) {
        SerializableClass obj1 = new SerializableClass("Jyoti", 1, 25000.00, "Finance", "Org1");
        System.out.println("Before Serialization : " + obj1.toString());
        System.out.println("obj1 hashcode : " + obj1.hashCode());
        try {
            // Serialization obj1
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(obj1);
            // De-Serialization obj1
            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SerializableClass obj2 = (SerializableClass) ois.readObject();
            System.out.println("After De-Serialization : " + obj2.toString());
            System.out.println("obj1 hashcode : " + obj2.hashCode());
            System.out.println("are both objects reference same : " + (obj2.hashCode() == obj1.hashCode()));
            System.out.println("are both objects equal : " + obj1.equals(obj2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
