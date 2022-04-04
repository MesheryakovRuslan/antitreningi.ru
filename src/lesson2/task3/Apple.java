package lesson2.task3;

public class Apple extends Fruits {
    private int prise;
    static int weightApple = 0;

    Apple(int prise, int weightApple){
        this.prise = prise;
        this.weightApple += weightApple;
        setWeightFruits(weightApple);
    }

    @Override
    public String calculationOfTheCostOfTheGoodsText(){
        return "Цена за яблоки " + (prise * weightApple) + " за " + weightApple + " кг";
    }

    @Override
    public int calculationOfTheCostOfTheGoodsInt(){
        return  (prise * weightApple);
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public static int getWeightApple() {
        return weightApple;
    }

    public static void setWeightApple(int weightApple) {
        Apple.weightApple = weightApple;
    }
}
