package lesson2.task3;

public class Apricots extends Fruits{
    private int prise;
    private static int weightApricots;

    Apricots(int prise, int weightApricots){
        this.prise = prise;
        this.weightApricots += weightApricots;
        setWeightFruits(weightApricots);
    }

    @Override
    public String calculationOfTheCostOfTheGoodsText(){
        return "Цена за абрикосы " + (prise * weightApricots) + " за " + weightApricots + " кг";
    }

    @Override
    public int calculationOfTheCostOfTheGoodsInt(){
        return  (prise * weightApricots);
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public static int getWeightApricots() {
        return weightApricots;
    }

    public static void setWeightApricots(int weightApricots) {
        Apricots.weightApricots = weightApricots;
    }
}
