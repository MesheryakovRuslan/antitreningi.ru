package lesson5.task5;

public class Main {
    public static void main(String[] args) {
        print("Степанова", '3',"Физике");
        print("Егоров", '4',"Физике");
        print("Захаров", '5',"Физике");
        print("Карпов", '2',"Физике");
        print("Бессорабова", '3',"Физике");
        print("Киримова", '3',"Физике");
    }

    public static void print(String name, char grade, String subject) {
        System.out.format("Студент %-15s получил %-3s по %-10s %n", name, grade, subject);
    }
}
