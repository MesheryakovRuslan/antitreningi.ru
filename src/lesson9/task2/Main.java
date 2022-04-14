package lesson9.task2;

import lesson9.task1.WrongLoginException;
import lesson9.task1.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String loginUser = "name_2000";
        String passwordUser = "HardPassword_2000";
        String login;
        String password;

        System.out.println("Логин: "+ loginUser +"\nПользователь: " + passwordUser );
        System.out.println("Введите логин");
        Scanner loginScanner = new Scanner(System.in);
        login = loginScanner.nextLine();

        System.out.println("Введите пароль");
        Scanner passwordScanner = new Scanner(System.in);
        password = passwordScanner.nextLine();

        if(userAuthentication(login,password,loginUser,passwordUser)){
            System.out.println("Добро пожаловать");
        }else {
            System.out.println("Не верный логин или пароль");
        }
    }

    public static boolean userAuthentication(String login, String password, String loginUser, String passwordUser){
        try {
            if (!login.equals(loginUser)){
                //throw new WrongLoginException(100,"login incorrect");
            }

            if(!password.equals(passwordUser)){
                throw new WrongPasswordException(101,"password incorrect");
            }

            return true;
        } catch ( WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }

}
