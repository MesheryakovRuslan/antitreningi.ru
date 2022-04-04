package lesson4.task1;

public class Main {
    public static void main(String[] args) {
        Double num = Double.valueOf(9.34);
        double dnum = num;
        System.out.println("Создайте объекты класса Double, используя методы valueOf() = " + num);
        System.out.println();

        String srt = "32.5";
        double num2 = Double.parseDouble(srt);
        System.out.println("Преобразовать значение типа String к типу double. Используем метод Double.parseDouble() = " + num2);
        System.out.println();
        System.out.println("Преобразовать объект класса Double ко всем примитивным типам: ");

        byte num3 =(byte) dnum;
        System.out.println("bute = " + num3);

        short num4 =(short) dnum;
        System.out.println("short = " + num4);

        int num5 =(int) dnum;
        System.out.println("int = " + num5);

        float num6 =(float) dnum;
        System.out.println("float = " + num6);

        long num7 =(long) dnum;
        System.out.println("long = " + num7);

        System.out.println();
        System.out.println("Вывести значение объекта Double на консоль");
        System.out.println(num);

        System.out.println("Преобразовать литерал типа double к строке: String d = Double.toString(3.14);");
        String d = Double.toString(3.14);

        System.out.println(d);
    }
}
