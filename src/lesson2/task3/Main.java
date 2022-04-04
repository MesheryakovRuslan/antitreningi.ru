package lesson2.task3;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(450,3);
        Pear pear = new Pear(370,2);
        Apricots apricots = new Apricots(320,3);

        System.out.println(apple.calculationOfTheCostOfTheGoodsText());
        System.out.println(pear.calculationOfTheCostOfTheGoodsText());
        System.out.println(apricots.calculationOfTheCostOfTheGoodsText());

        System.out.println("Общая стоимость чека: " + (apple.calculationOfTheCostOfTheGoodsInt()
                +pear.calculationOfTheCostOfTheGoodsInt()
                +apricots.calculationOfTheCostOfTheGoodsInt()));

        System.out.println("Оющий вес покупки: " + (apple.getWeightFruits()) + " кг" );
        apple.printManufacturerInfo();



    }


}
