package lesson2.task2;

public class Roses extends Flower {
    static int count;

    Roses(String countryOfOrigin, int shelfLifeInDays,int price){
        setCountryOfOrigin(countryOfOrigin);
        setShelfLifeInDays(shelfLifeInDays);
        setPrice(price);
    }

    public int rosesBuy(int countRoses){
        count+=countRoses;
        return countRoses * getPrice();
    }

    public static int getCount() {
        return count;
    }
}
