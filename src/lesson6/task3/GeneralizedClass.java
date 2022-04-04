package lesson6.task3;

import java.io.Serializable;

public class GeneralizedClass<T extends Comparable,V extends Animal & Serializable ,K extends Number> {
    private T obT;
    private V obV;
    private K obK;

    public GeneralizedClass(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public void getAllName() {
        getNameT();
        getNameV();
        getNameK();
    }

    public void getNameT() {
        System.out.println(obT.getClass().getName());
    }

    public void getNameV() {
        System.out.println(obV.getClass().getName());
    }

    public void getNameK() {
        System.out.println(obK.getClass().getName());
    }
}
