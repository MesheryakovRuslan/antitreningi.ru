package lesson2.task2;

public class Tulips extends Flower {
    static int count;

    Tulips(String countryOfOrigin, int shelfLifeInDays,int price) {
        setCountryOfOrigin(countryOfOrigin);
        setShelfLifeInDays(shelfLifeInDays);
        setPrice(price);
    }

    public int tulipsBuy(int countTulips) {
        count+=countTulips;
        return countTulips * getPrice();
    }

    public static int getCount() {
        return count;
    }
}
