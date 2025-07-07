package Entities;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name,int age, double height) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isUnder16(){
        return age < 16;
    }

    public String toString() {
        return "Name: " + name +
                "Age: " + age +
                "Height: " + height;
    }
}
