package lesson11.task2;

import java.io.Serializable;

public class CartSave implements Serializable {

    private Technics[] buySave;

    CartSave(Technics[] buy){
        this.buySave = buy.clone();

    }

    public Technics[] getBuy() {
        return buySave;
    }
}
