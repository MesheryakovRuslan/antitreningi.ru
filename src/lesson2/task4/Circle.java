package lesson2.task4;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {}

    //Площадь круга через радиус
    public double areaOfCircleThroughRadius() {
        double areaOfCircle;
        return areaOfCircle = PI * Math.pow( radius,2);
    }

    //длину окружности
    public double circumference() {
        double circumference;
        return circumference = 2 * PI * radius;
    }
}
