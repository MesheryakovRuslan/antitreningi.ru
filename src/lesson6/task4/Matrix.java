package lesson6.task4;

public class Matrix <T extends Number> {
    private T[][] arr;
    private T[][] arr2;

    public Matrix(T[][] arr, T[][] arr2){
        this.arr = arr.clone();
        this.arr2 = arr2.clone();
    }

    public void printFirstMatrix(){
        for (int i = 0; i< this.arr.length; i++){
            for (int j=0;j<this.arr[0].length;j++){
                System.out.print(this.arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public void printLastMatrix(){
        for (int i = 0; i< this.arr2.length; i++){
            for (int j=0;j<this.arr2[0].length;j++){
                System.out.print(this.arr2[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    //сложение матриц
    public void matrixAddition(){
        for (int i = 0; i< this.arr.length; i++){
            for (int j=0;j<this.arr[0].length;j++){
                if (arr[i][j] instanceof Integer && arr2[i][j] instanceof Integer) {
                    System.out.print((arr[i][j].intValue() + arr2[i][j].intValue()) + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Double && arr2[i][j] instanceof Double) {
                    System.out.print((arr[i][j].doubleValue() + arr2[i][j].doubleValue()) + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Byte && arr2[i][j] instanceof Byte) {
                    System.out.print((arr[i][j].byteValue() + arr2[i][j].byteValue()) + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Long && arr2[i][j] instanceof Long) {
                    System.out.print((arr[i][j].longValue() + arr2[i][j].longValue()) + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Short && arr2[i][j] instanceof Short) {
                    System.out.print((arr[i][j].shortValue() + arr2[i][j].shortValue()) + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Float && arr2[i][j] instanceof Float) {
                    System.out.print((arr[i][j].floatValue() + arr2[i][j].floatValue()) + "\t\t");
                    continue;
                }
            }
            System.out.println();
        }
    }

    //Умножение матрицы на число
    public void matrixMultiplicationByNumber(T number){
        for (int i = 0; i< this.arr.length; i++){
            for (int j=0;j<this.arr[0].length;j++){
                if (arr[i][j] instanceof Integer && number instanceof Integer) {
                    System.out.print(arr[i][j].intValue() * number.intValue() + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Double && number instanceof Double) {
                    System.out.print(arr[i][j].doubleValue() * number.doubleValue() + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Byte && number instanceof Byte) {
                    System.out.print(arr[i][j].byteValue() * number.byteValue() + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Long && number instanceof Long) {
                    System.out.print(arr[i][j].longValue() * number.longValue() + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Short && number instanceof Short) {
                    System.out.print(arr[i][j].shortValue() * number.shortValue() + "\t\t");
                    continue;
                }
                if (arr[i][j] instanceof Float && number instanceof Float) {
                    System.out.print(arr[i][j].floatValue() * number.floatValue() + "\t\t");
                    continue;
                }
            }
            System.out.println();
        }
    }
}


