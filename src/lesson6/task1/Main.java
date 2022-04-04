package lesson6.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skLog = new Scanner(System.in);

        System.out.println("Введите логин");
        String log = skLog.nextLine();
        System.out.println("Введите пароль");
        Scanner skPass = new Scanner(System.in);
        String pass = skPass.nextLine();

        User user =new User();
        user.createQuery(log,pass);
    }
}
