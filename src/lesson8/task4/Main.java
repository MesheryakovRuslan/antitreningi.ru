package lesson8.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Product> hashMap = new HashMap();

        hashMap.put("Человек паук", new Product("Фигурка"));
        hashMap.put("Флаттершай", new Product("Фигурка"));
        hashMap.put("Вселенная Стивена", new Product("Пазл"));
        hashMap.put("Кубик рубик", new Product("Головоломка"));
        hashMap.put("Человек павук", new Product("Пазл"));
        hashMap.put("Дилюк", new Product("Фигурка"));

        getEntrySet(hashMap);
        getKeySet(hashMap);
        getValues(hashMap);
    }

    public static void getEntrySet(Map<String,Product> hashMap) {
        for(Map.Entry<String,Product> item : hashMap.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getNameToy());
        }
    }

    public static void getKeySet(Map<String,Product> hashMap) {
        for(String item : hashMap.keySet()) {
            System.out.printf("Key: %s \n", hashMap.get(item));
        }
    }

    public static void getValues(Map<String,Product> hashMap) {
        for(Product item: hashMap.values()) {
            System.out.printf("Value: %s \n", hashMap.get(item.toString()));
        }
    }
}
