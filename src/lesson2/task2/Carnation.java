package lesson2.task2;

public class Carnation extends Flower {
    static int count;

    Carnation(String countryOfOrigin, int shelfLifeInDays,int price) {
        setCountryOfOrigin(countryOfOrigin);
        setShelfLifeInDays(shelfLifeInDays);
        setPrice(price);
    }
    public int carnationBuy(int countCarnation) {
        count+=countCarnation;
        return countCarnation * getPrice();
    }

    public static int getCount() {
        return count;
    }
}
