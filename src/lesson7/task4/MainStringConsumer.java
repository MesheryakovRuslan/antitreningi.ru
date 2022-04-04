package lesson7.task4;

import java.util.function.Consumer;

public class MainStringConsumer {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(7.0);

        Consumer<HeavyBox> printHeavyBoxOut = (HeavyBox box) -> System.out.format("Отгрузили ящик с весом %s \n", box.getWeight());
        Consumer<HeavyBox> printHeavyBoxSend = (HeavyBox box)   -> System.out.format("Отправляем ящик с весом %s \n", box.getWeight());

        printHeavyBoxOut.andThen(printHeavyBoxSend).accept(heavyBox);
    }
}
