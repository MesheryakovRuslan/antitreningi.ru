package lesson1.task2;

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    Person(){
        this.fullName = "anonim";
    }

    public void talk(String text){
        System.out.println(fullName + ", говорит:" + text);
    }

    public void move(String text){
        System.out.println(fullName + ", совершает действие:" + text);
    }
}
