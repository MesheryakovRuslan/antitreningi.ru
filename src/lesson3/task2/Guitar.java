package lesson3.task2;

public class Guitar implements MusicalInstrument {
    private String numberOfStrings;

    Guitar(String numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    }

    public Guitar(){}

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}
