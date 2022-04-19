package lesson11.task2;

import java.util.Scanner;

public class UserAuthentication {
    private  String PASSWORD ="a";
    private final String LOGIN = "1";
    private String login;
    private String password;
    private boolean Authentication = false;

    public boolean examinationUserData(String login, String password){
        if(LOGIN.equals(login)) {
            if(PASSWORD.equals(password)) {
                Authentication = true;
                return true;
            }else {
                System.out.println("Не верный пароль");
            return false;
            }
        }else {
            System.out.println("Не верный логин");
            return false;
        }
    }

    public void userAuthentication() {
        do {
            Scanner scannerlogin = new Scanner(System.in);
            System.out.print("Введите логин: ");
            login = scannerlogin.nextLine();

            Scanner scannerPassword = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            password = scannerPassword.nextLine();
            System.out.println("");
        }while (!examinationUserData(login,password));
        System.out.println("Вход выполнен");
    }
}
