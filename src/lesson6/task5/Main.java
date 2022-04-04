package lesson6.task5;

public class Main {
    public static void main(String[] args) {

        Double[] arrDouble = {1.2, 1.8 ,5.7, 0.3, 9.9, 0.1, 0.2, 10.11 , -15.05};

        Integer[] arrInt = {-1,-5,4,8,9,100,-100};

        MinMax minMaxDouble = new MinMax(arrDouble);
        minMaxDouble.minMax();

        MinMax minMaxInt = new MinMax(arrInt);
        minMaxInt.minMax();
    }
}
