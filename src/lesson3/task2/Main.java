package lesson3.task2;

public class Main {
    public static void main(String[] args){

        MusicalInstrument[] musicalInstrument = new MusicalInstrument[5];
        musicalInstrument[0] = new Guitar("6");
        musicalInstrument[1] = new Drum("864mm");
        musicalInstrument[2] = new Guitar("4");
        musicalInstrument[3] = new Trumpet("1.5");
        musicalInstrument[4] = new Drum("970mm");

        for (int i = 0; i<musicalInstrument.length; i++){
            musicalInstrument[i].play();
        }
    }
}
