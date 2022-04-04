package lesson7.task6;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier supplier = () ->{
            int randomInt = (int) (Math.random()*10);
            return randomInt;
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
