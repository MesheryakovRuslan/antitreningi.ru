package lesson3.task4;

public class Tie extends Clothes implements ManClothes{
    final String NAME = "Галстук";

    public Tie(ClothesSize sizeTie, int priceTie, String colorTie) {
        setSizeClothes(sizeTie);
        setPriceClothes(priceTie);
        setColorClothes(colorTie);
        setName(getNAME());
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public void dressAMan() {

    }
}
