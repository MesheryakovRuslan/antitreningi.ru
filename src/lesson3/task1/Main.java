package lesson3.task1;

public class Main {
    public static void main(String[] args) {

        Printable[] shop = new Printable[8];
        shop[0]= new Book("Сборник стихов Блок.А.А");
        shop[1]= new Magazine("Мурзилка");
        shop[2]= new Book("Песнь льда и пламени Джордж.Р.Р Мартин");
        shop[3]= new Magazine("Человке паук");
        shop[4]= new Magazine("Шрек");
        shop[5]= new Book("Мечтают ли андроиды об электроовцах?");
        shop[6]= new Book("ВЫпечка");
        shop[7]= new Book("Убийство на улице морг");

        for(int i = 0; i < shop.length; i++) {
            shop[i].print();
        }

        Book.printBook(shop);
        Magazine.printMagazine(shop);
    }
}
