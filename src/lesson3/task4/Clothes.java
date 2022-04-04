package lesson3.task4;

public abstract class Clothes {
    private ClothesSize sizeClothes;
    private int priceClothes;
    private String colorClothes;

    //? Добавил для удобства вывода
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }



    public ClothesSize getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(ClothesSize sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

    public int getPriceClothes() {
        return priceClothes;
    }

    public void setPriceClothes(int priceClothes) {
        this.priceClothes = priceClothes;
    }

    public String getColorClothes() {
        return colorClothes;
    }

    public void setColorClothes(String colorClothes) {
        this.colorClothes = colorClothes;
    }
}
