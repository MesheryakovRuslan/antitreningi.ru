package lesson7.task3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str1 ="null A";
        String str2 ="JAVA";
        String str3 ="Java";
        String str4 ="Null";

        Predicate<String> ChekStartsWith = (String s) -> ((s.startsWith("J")) || s.startsWith("N"));
        Predicate<String> ChekEndsWith = (String s) -> (s.endsWith("A"));

        System.out.println(ChekStartsWith.and(ChekEndsWith).test(str1));
        System.out.println(ChekStartsWith.and(ChekEndsWith).test(str2));
        System.out.println(ChekStartsWith.and(ChekEndsWith).test(str3));
        System.out.println(ChekStartsWith.and(ChekEndsWith).test(str4));
    }
}
