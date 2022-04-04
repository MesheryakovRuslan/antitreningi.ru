package lesson3.task5;

public class Cart {
    public static Technics[] buy = new Technics[5];
    public static int step = 0;

    public static boolean addProduct(Technics product) {
        if(buy.length-1 >= step ) {

            buy[step] = product;
            step++;
            return true;
        }
        return false;
    }



}
