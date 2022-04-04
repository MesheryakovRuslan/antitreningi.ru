package lesson2.task2;

public class Flower {
    private String countryOfOrigin;
    private int shelfLifeInDays;
    private int price;

    Flower(){}

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
