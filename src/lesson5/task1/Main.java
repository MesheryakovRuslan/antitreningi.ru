package lesson5.task1;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String str = "I like java!!!";
        System.out.println(str);
        actionOne(str);
    }

    public static void actionOne(String str){
        char ch = str.charAt(str.length()- 1);
        System.out.println("Распечатать последний символ строки. Используем метод String.charAt().");
        System.out.println(ch);

        System.out.println("Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().");
        boolean var = str.endsWith("!!!");
        System.out.println(var);

        System.out.println("Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). ");
        boolean var2 = str.startsWith("I like");
        System.out.println(var2);

        System.out.println("Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().");
        boolean var3 = str.contains("java");
        System.out.println(var3);

        System.out.println("Найти позицию подстроки “Java” в строке “I like Java!!!”.");
        int var4 = str.indexOf("java");
        int var5 = str.lastIndexOf("java");
        System.out.println("Позиция вхождения  " + var4+ " позиция последнего вхождения "+ var5 );

        System.out.println("Заменить все символы “а” на “о”.");
        System.out.println(str.replace("a","o"));

        System.out.println("Преобразуйте строку к верхнему регистру.");
        System.out.println(str.toUpperCase(Locale.ROOT));

        System.out.println("Преобразуйте строку к нижнему регистру.");
        System.out.println(str.toLowerCase(Locale.ROOT));

        System.out.println("Вырезать строку Java c помощью метода String.substring().");

        System.out.println(str.substring(var4,var4+"java".length()));
    }
}
