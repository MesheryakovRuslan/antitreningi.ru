package lesson3.task4;

public class TeeShirt extends Clothes implements ManClothes, WomenClothes {

    final String NAME = "Футболка";

    public TeeShirt(ClothesSize sizeTeeShirt, int priceTeeShirt, String colorTeeShirt) {
        setSizeClothes(sizeTeeShirt);
        setPriceClothes(priceTeeShirt);
        setColorClothes(colorTeeShirt);
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
