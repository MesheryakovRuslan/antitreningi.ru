package lesson1.task3;

public class Matrix {
    private double [][] arr;
    private int row,column ;

    Matrix(int row, int column) {

        this.row = row;
        this.column = column;
        this.arr = new double [this.row][this.column];

        for (int i = 0; i< this.row; i++) {
            for (int j=0;j<this.column;j++) {
                this.arr[i][j] = j;
            }
        }
    }

    Matrix(double[][] array) {

        this.row = array.length;
        this.column = array[0].length;
        this.arr = new  double[row][column];

        for (int i = 0; i< row; i++) {
            for (int j=0;j<column;j++) {
                this.arr[i][j] = array[i][j];
            }
        }
    }

    public void matrixAddition(double [][] array) {
        for (int i = 0; i< this.row; i++) {
            for (int j=0;j<this.column;j++) {
            this.arr[i][j] += array[i][j];
            }
        }
    }

    public void matrixMultiplicationByNumber(int number) {
        for (int i = 0; i< this.row; i++) {
            for (int j=0;j<this.column;j++) {
                this.arr[i][j] *=number;
            }
        }
    }

    public void printMatrix(){
        for (int i = 0; i< this.row; i++) {
            for (int j=0;j<this.column;j++) {
                System.out.print(this.arr[i][j] + "\t" + "\t");
            }
            System.out.println();
        }
    }

    public double[][] getArr() {
        return arr;
    }

}
