package lesson5.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str =  "1 Object-oriented programming is a programming " +
                "language model organized around objects rather than " +
                "'actions' and data rather than logic. 2 Object-oriented " +
            "programming blabla. 3 Object-oriented programming bla.";

        makeAnAbbreviation(str);
    }

    public static void makeAnAbbreviation(String str) {
        int step = 1;
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("(object-oriented programming)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            if(step%2 == 0) {
            matcher.appendReplacement(sb,"OOP");
            }
            step++;
        }

        matcher.appendTail(sb);
        System.out.println(sb);
    }
}
