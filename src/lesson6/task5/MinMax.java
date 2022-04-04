package lesson6.task5;

public class MinMax <T extends Number & Comparable<T>>{
    T[] arr;

    MinMax(T[] arr){
        this.arr = arr.clone();
    }

    public void minMax(){
        T min = arr[0];
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
            if(arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        System.out.format("Минимальный элемент : %s \nМаксимальный элемент %s\n ",min,max);
    }
}

