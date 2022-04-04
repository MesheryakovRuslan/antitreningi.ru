package lesson2.task4;

public class Main {
    public static void main(String[] args) {

        Circle circleOne = new Circle(4);
        Circle circleTwo = new Circle(3.6);
        Circle circleThree = new Circle(4.5);

        System.out.println("Площадь круга: " + circleOne.areaOfCircleThroughRadius());
        System.out.println("Длина окружности: " + circleOne.circumference());

        System.out.println("Площадь круга: " + circleTwo.areaOfCircleThroughRadius());
        System.out.println("Длина окружности: " + circleTwo.circumference());

        System.out.println("Площадь круга: " + circleThree.areaOfCircleThroughRadius());
        System.out.println("Длина окружности: " + circleThree.circumference());
    }
}
