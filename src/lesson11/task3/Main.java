package lesson11.task3;

import lesson11.task2.Repository;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String arg[]) {
        String classPath = "lesson3.task5.Repository";
        try {
            Class cs = Class.forName(classPath);
            System.out.println(cs.getName());

            System.out.println();
            Repository P = new Repository();
            Class pcls = P.getClass();
            System.out.println(pcls.getName());
            System.out.println();

            System.out.println("текущий класс — интерфейс или простой класс");
            System.out.println(Class.forName(classPath).isInterface());

            Field fields[] = cs.getDeclaredFields();
            System.out.println();
            System.out.println("Поля класса");

            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            Method methods[] = pcls.getDeclaredMethods();
            System.out.println();
            System.out.println("Методы класса");

            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
            }

            Constructor<Repository> constructors[] = pcls.getDeclaredConstructors();
            System.out.println();
            System.out.println("Конструктор класса");

            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i]);
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
