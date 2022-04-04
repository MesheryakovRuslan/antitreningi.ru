package lesson3.task5;

public class Main {
    public static void main(String[] arg) {
        //Аутентификация пользователя
       UserAuthentication userAuthentication = new UserAuthentication();
       userAuthentication.userAuthentication();

       Control control = new Control();
       while(control.nextStep());
    }




}
