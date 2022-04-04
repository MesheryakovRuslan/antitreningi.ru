package lesson6.task4;

public class Main {
    public static void main(String[] args) {

        Double num = 3.4;
        final Double [][] arr = {
                {0.5,    3.5,   7.8,    5.6},
                {4.6,    3.1,   0.1,    7.2},
                {4.6,    4.1,   5.6,    8.5}
        };

        final Double [][] arr2 = {
                {6.5,    3.6,   1.8,    5.1},
                {4.4,    5.1,   9.0,    1.1},
                {2.5,    4.9,   2.6,    9.2}
        };

        Matrix oneMatrix = new Matrix(arr,arr2);

        System.out.println("Первая матрица");
        oneMatrix.printFirstMatrix();

        System.out.println("\nВторая матрица");
        oneMatrix.printLastMatrix();

        System.out.println("\nСложение матриц двух матриц");
        oneMatrix.matrixAddition();

        System.out.println("\nУмножение матрицы на число " + num);
        oneMatrix.matrixMultiplicationByNumber(num);
    }
}
