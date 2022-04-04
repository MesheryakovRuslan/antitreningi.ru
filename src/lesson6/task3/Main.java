package lesson6.task3;

public class Main {
    public static void main(String[] args) {
        String str = "40";
        Double numDob = 54.5;
        Animal animal = new Animal("Кролик");
        GeneralizedClass gc = new GeneralizedClass(str,animal,numDob);

        gc.getAllName();
    }
}
