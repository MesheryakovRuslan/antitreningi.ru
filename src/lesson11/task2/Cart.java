package lesson11.task2;

import lesson11.task1.Horse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cart {
    public static Technics[] buy = new Technics[5];
    public static int step = 0;

    public static boolean addProduct(Technics product) {
        if(buy.length-1 >= step ) {

            buy[step] = product;
            step++;
            return true;
        }
        return false;
    }

    public static Technics[] getBuy() {
        return buy;
    }

    public static void setBuy(Technics[] buy) {
        Cart.buy = buy;
    }

    public static int getStep() {
        return step;
    }

    public static void setStep(int step) {
        Cart.step = step;
    }
}
