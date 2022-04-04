package lesson2.task3;

public abstract class Fruits {
    static int weightFruits;

    public int getWeightFruits() {
        return weightFruits;
    }

    public void setWeightFruits(int weightFruits) {
        Fruits.weightFruits += weightFruits;
    }

    final public void printManufacturerInfo(){
        System.out.print("Made in Ukraine");
    }

    public String calculationOfTheCostOfTheGoodsText(){
        return "";
    }

    public int calculationOfTheCostOfTheGoodsInt(){
        return 0;
    }
}
