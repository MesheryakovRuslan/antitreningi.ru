package lesson3.task4;

public class Skirt extends Clothes implements WomenClothes {
    final String NAME = "Юбка";

    public Skirt(ClothesSize sizeSkirt, int priceSkirt, String colorSkirt) {
        setSizeClothes(sizeSkirt);
        setPriceClothes(priceSkirt);
        setColorClothes(colorSkirt);
        setName(getNAME());
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public void dressAWomen() {

    }
}