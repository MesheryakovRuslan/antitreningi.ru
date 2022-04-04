package lesson3.task2;

public class Drum implements MusicalInstrument{
    private String size;

    Drum(String size) {
        this.size = size;
    }

    public Drum() {}

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + size);

    }
}
