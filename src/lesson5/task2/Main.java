package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;

        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1+num2).append("\n");
        sb.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
        sb.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2).append("\n");;
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(num1).append(" + ").append(num2).append(" = ").append(num1+num2).append("\n");
        sb2.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
        sb2.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2).append("\n");

        int i = sb.indexOf("=");
        System.out.println("Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt(). ");

        while (i != -1){
            sb.deleteCharAt(i);
            sb.insert(i,"равно");
            i = sb.indexOf("=");
        }

        System.out.println(sb);
        System.out.println("Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().");
        System.out.println(sb2.toString().replace("=","равно"));
    }
}
