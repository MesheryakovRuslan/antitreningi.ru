package lesson1.task2;

public class Main {
    public static void main(String[] args) {

        Person player = new Person("steve", 28);
        Person anonim = new Person();

        player.talk("Привет");
        player.move("Протягивает руку");

        anonim.talk("Привет");
        anonim.move("Протягивает руку");
    }
}
