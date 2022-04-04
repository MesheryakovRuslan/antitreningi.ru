package lesson7.task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str1 = null;
        String str2 ="";
        String str3 ="null";

        Predicate<String> notNullChek = (String s) -> (s != null);
        Predicate<String> notVoidChek = (String s) -> (!(s.equals("")));

        System.out.println(notNullChek.and(notVoidChek).test(str1));
        System.out.println(notNullChek.and(notVoidChek).test(str2));
        System.out.println(notNullChek.and(notVoidChek).test(str3));
    }
}
