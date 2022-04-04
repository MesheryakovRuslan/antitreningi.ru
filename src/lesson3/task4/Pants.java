package lesson3.task4;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    final String NAME = "Штаны";

    public Pants(ClothesSize sizePants, int pricePants, String colorPants) {
        setSizeClothes(sizePants);
        setPriceClothes(pricePants);
        setColorClothes(colorPants);
        setName(getNAME());
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public void dressAMan() {

    }

    @Override
    public void dressAWomen() {

    }
}
