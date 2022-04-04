package lesson2.task3;

public class Pear extends Fruits{
    private int prise;
    private static int weightPear;

    Pear(int prise, int weightPear){
        this.prise = prise;
        this.weightPear += weightPear;
        setWeightFruits(weightPear);
    }

    @Override
    public String calculationOfTheCostOfTheGoodsText(){
        return "Цена за груши " + (prise * weightPear) + " за " + weightPear + " кг";
    }

    @Override
    public int calculationOfTheCostOfTheGoodsInt(){
        return  (prise * weightPear);
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public static int getWeightPear() {
        return weightPear;
    }

    public static void setWeightPear(int weightPear) {
        Pear.weightPear = weightPear;
    }
}
