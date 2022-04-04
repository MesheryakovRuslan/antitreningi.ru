package lesson7.task1;

import lesson3.task1.Printable;

public class Main {
    public static void main(String[] args) {

        Printable printer = () -> System.out.println("Лямбда");
        Printable printer2 = Main::printS;
        printer.print();
        printer2.print();
    }

    public static int printS(){
        System.out.format("1 и 1.1 задание");
        return 1;
    }
}


