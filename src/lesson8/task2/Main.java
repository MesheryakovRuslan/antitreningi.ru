package lesson8.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);
        String delimeter = "\\, ";
        String[] arr = str.split(delimeter);

        List arrayList = new ArrayList();
        Collections.addAll(arrayList,arr);

        Set set = new LinkedHashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(set);

        System.out.println(arrayList);
    }
}
