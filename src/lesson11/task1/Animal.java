package lesson11.task1;

import java.io.Serializable;

public class Animal implements Serializable {
    private String color;
    private int age;
    private String name;

    public Animal(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
