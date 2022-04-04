package lesson8.task3;

import lesson7.task4.HeavyBox;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = new ArrayList();
        List<HeavyBox> veryHeavyBoxList = new ArrayList();

        heavyBoxList.add(new HeavyBox(500.0));
        heavyBoxList.add(new HeavyBox(200.0));
        heavyBoxList.add(new HeavyBox(400.0));
        heavyBoxList.add(new HeavyBox(100.0));
        heavyBoxList.add(new HeavyBox(1500.0));
        heavyBoxList.add(new HeavyBox(8000.0));
        heavyBoxList.add(new HeavyBox(650.0));

        System.out.println(heavyBoxList);

        ListIterator<HeavyBox> listIterator = heavyBoxList.listIterator();

        while (listIterator.hasNext()) {
            HeavyBox nextHeavyBox = listIterator.next();
            if((double)nextHeavyBox.getWeight() > (double) 300.0) {
                veryHeavyBoxList.add(nextHeavyBox);
                listIterator.remove();
            }
        }

        System.out.println(heavyBoxList);
        System.out.println(veryHeavyBoxList);
    }
}
