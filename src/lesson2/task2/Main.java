package lesson2.task2;

public class Main {
    public static void main(String[] args) {

        Roses roses = new Roses("Польща",14,800);
        Carnation carnation = new Carnation("Россия",16,250);
        Tulips tulips = new Tulips("Турция",20,400);

        int[] bouquet1 = new int[] {roses.rosesBuy(4), tulips.tulipsBuy(10)};
        int[] bouquet2 = new int[] {roses.rosesBuy(4), tulips.tulipsBuy(3), carnation.carnationBuy(3)};
        int[] bouquet3 = new int[] {roses.rosesBuy(5), tulips.tulipsBuy(5), carnation.carnationBuy(5)};

        System.out.println(roses.getCount() + carnation.getCount() + tulips.getCount() + " цветов было продано");
        System.out.println(arrSum(bouquet1,bouquet2,bouquet3) + " стоимость 3х букетов");
    }

    public static int arrSum(int[]...arr) {
        int sum=0;

        for (int i = 0; i< arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
        }
        return sum;
    }
}
