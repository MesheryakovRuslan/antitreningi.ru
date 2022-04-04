package lesson1.task4;

public class Main {

    public static void main(String[] args){

        Reader[] reader = new Reader[4];
        reader[0] = new Reader("Олег С.О","001","Гриффиндор");
        reader[1] = new Reader("Иван Г.Е","021","Пуффендуй","21.03.2004","89-43-76");
        reader[2] = new Reader("Евгения Г.Е","041","Когтевран");
        reader[3] = new Reader("Светлана Г.Е","054","Слизерин");

        Book[] book = new Book[5];
        book[0] = new Book("Астрономия","Астроном");
        book[1] = new Book("Волшебство","Волшебник");
        book[2] = new Book("Гадание","Гадалка");
        book[3] = new Book("История","Историк");
        book[4] = new Book("Заклинания","Волшебник");

        reader[2].takeBook(2);
        reader[1].takeBook("Астрономия,","Волшебство,","Заклинания");
        reader[0].takeBook(book[0],book[2],book[3]);
        reader[3].returnBook(3);
        reader[1].returnBook(book[0],book[4]);
        reader[2].returnBook(2);
    }
}
