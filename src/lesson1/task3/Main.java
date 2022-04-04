package lesson1.task3;

public class Main {
    public static void main(String[] args) {

        final double [][] arr = {
                {0.5,3.5,7.8,5.6},
                {4.6,6.1,2.0,7.2},
                {4.6,4.1,5.6,8.5}
                };

        Matrix oneMatrix = new Matrix(arr);
        Matrix twoMatrix = new Matrix(3,4);

        System.out.println("Первая матрица");
        oneMatrix.printMatrix();

        System.out.println("Вторая матрица");
        twoMatrix.printMatrix();

        System.out.println("Сложение матриц");
        oneMatrix.matrixAddition(twoMatrix.getArr());
        oneMatrix.printMatrix();

        System.out.println("Умножение второй матрицы на число");
        twoMatrix.matrixMultiplicationByNumber(5);
        twoMatrix.printMatrix();
    }
}
