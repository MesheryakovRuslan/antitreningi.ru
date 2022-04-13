package lesson9.task1;

import sun.security.util.Password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login;
        String password = "1";
        String confirmPassword = "1";

        System.out.println("Введите логин. Он должен иметь латинские буквы, цыфры, и символ \"_\"");
        Scanner loginIn = new Scanner(System.in);
        login = loginIn.nextLine();

        System.out.println("Введите пароль");
        Scanner passwordIn = new Scanner(System.in);
        password = passwordIn.nextLine();

        System.out.println("Введите пароль ещё раз");
        Scanner confirmPasswordIn = new Scanner(System.in);
        confirmPassword = confirmPasswordIn.nextLine();

        logIn(login,password,confirmPassword);
    }

    public static boolean logIn(String login, String password, String confirmPassword) {
        String regLogin= "[a-zA-Z]+([_]+[0-9]+|[0-9]+[_]+)";
        Pattern pattern = Pattern.compile(regLogin);
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        try {
            if (matcherLogin.matches() && login.length() < 20) {
                System.out.println("Логин пдтверждён");
            } else {
                throw new WrongLoginException(100, "login incorrect");
            }

            if (!matcherPassword.matches() && !(password.length() < 20)){
                throw new WrongPasswordException(101, "password incorrect");
            }

            if (password.equals(confirmPassword)){
                System.out.println("Пароль пдтверждён");
            } else {
                throw new WrongPasswordException(101, "passwords do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException  e) {
            System.out.println("Exception: " + e.toString());
            return false;
        }
    }
}
