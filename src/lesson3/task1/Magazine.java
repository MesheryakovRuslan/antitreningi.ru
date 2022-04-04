package lesson3.task1;

public class Magazine implements Printable {

    private String nameMagazine;

    Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }
    public Magazine() {}

    @Override
    public void print() {
        System.out.println("Журнал: " + getNameMagazine());
    }

    public static void printMagazine(Printable[] printtables){
        System.out.println();
        System.out.println("Список только журналов");

        for (int i = 0; i < printtables.length; i++) {

            if(printtables[i] instanceof Magazine) {
                System.out.println("Журнал: " + ((Magazine) printtables[i]).getNameMagazine());
            }
        }
        System.out.println();
    }

    public String getNameMagazine() {
        return nameMagazine;
    }

    public void setNameMagazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }
}
