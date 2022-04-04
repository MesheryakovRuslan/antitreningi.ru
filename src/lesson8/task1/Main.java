package lesson8.task1;

import lesson7.task4.HeavyBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList();
        arrayList.add(new HeavyBox(1.2));
        arrayList.add(new HeavyBox(1.3));
        arrayList.add(new HeavyBox(1.4));
        arrayList.add(new HeavyBox(1.5));
        arrayList.add(new HeavyBox(7.2));
        arrayList.add(new HeavyBox(8.2));

        for (Object heavyBox: arrayList) {
          System.out.println(heavyBox);
        }

        System.out.println();
        arrayList.set(0,new HeavyBox(2.2));
        arrayList.remove(arrayList.size() -1);

        for (Object heavyBox: arrayList) {
            System.out.println(heavyBox);
        }

        System.out.println();
        System.out.println("Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.");

        //Первый вариант
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //Второй вариант
        HeavyBox[] heavyBoxArray1 = new HeavyBox[arrayList.size()];
        arrayList.toArray(heavyBoxArray1);
        System.out.println(Arrays.toString(heavyBoxArray1));

        //третий вариант
        HeavyBox[] heavyBoxArray2 = arrayList.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(heavyBoxArray2));

        System.out.println();
        System.out.println("Получить массив содержащий объекты класса HeavyBox из коллекции тремя способами и вывести на консоль.");

        //Первый вариант
        Object[] objectArray2 = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray2));

        //Второй вариант
        Object[] objectArray3 = new HeavyBox[arrayList.size()];
        arrayList.toArray(objectArray3);
        System.out.println(Arrays.toString(objectArray3));

        //третий вариант
        Object[] objectArray4 = arrayList.toArray(new Object[0]);
        System.out.println(Arrays.toString(objectArray4));

        arrayList.clear();

        for (Object heavyBox: arrayList) {
            System.out.println(heavyBox);
        }
    }
}
