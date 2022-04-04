package lesson6.task1;

import lesson3.task1.Printable;

public class User {
    private String login;
    private String password;

    public static void createQuery(String login, String password) {

        Printable printtable = new Printable() {
            @Override
            public void print() {
                System.out.format("Пользователь с логином %s и паролем %s авторизовался", login, password);
            }
        };
        printtable.print();
    }
}



