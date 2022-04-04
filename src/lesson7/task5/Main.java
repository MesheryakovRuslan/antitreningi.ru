package lesson7.task5;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Integer int1 = -5;
        Integer int2 = 0;
        Integer int3 = 5;

        Function<Integer,String> function = f -> {
            if(f>0){
              return "Положительное число";
            }else if(f<0){
                return "Отрицательное число";
            }else {
                return "Ноль";
            }
        };

        System.out.println(function.apply(int1));
        System.out.println(function.apply(int2));
        System.out.println(function.apply(int3));
    }
}
