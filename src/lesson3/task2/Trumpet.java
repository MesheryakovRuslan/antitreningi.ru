package lesson3.task2;

public class Trumpet implements MusicalInstrument {
    private String diameter;

    Trumpet(String diameter) {
        this.diameter = diameter;
    }

    public Trumpet(){}

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter);
    }
}
