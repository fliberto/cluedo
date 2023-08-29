package ch.bbw.fl.cluedo.model;

public class Person {
    private String name;
    private String hairColor;
    private int age;
    private double height;

    public Person(String name, String hairColor, int age, double height) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
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
}
