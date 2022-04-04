package lesson6.task6;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Сложение");
        calculator.sum(5.7,5);
        calculator.sum(5,5.7);
        calculator.sum(5,5);

        System.out.println("Умножение");
        calculator.multiply(5.7,5);
        calculator.multiply(5,5.7);
        calculator.multiply(5,5);

        System.out.println("Деление");
        calculator.divide(5.7,5);
        calculator.divide(5,5.0);
        calculator.divide(5,7);

        System.out.println("Вычитание");
        calculator.subtraction(5.7,5);
        calculator.subtraction(5,5.7);
        calculator.subtraction(5,7);
    }
}
