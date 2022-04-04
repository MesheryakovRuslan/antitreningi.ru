package lesson1.task4;

public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String bDay;
    private String phone;

    Reader(String fullName,String libraryCardNumber,String faculty,String bDay,String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.bDay = bDay;
        this.phone = phone;
    }

    Reader(String fullName,String libraryCardNumber,String faculty) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
    }

    public void takeBook(int count) {
        System.out.println(this.fullName + " взял " + count + " книг");
    }

    public void takeBook(String... nameBook) {
        System.out.println(this.fullName + " взял книги: " );
        for(int i = 0; i < nameBook.length; i++) {
            System.out.print( nameBook[i] + " ");
        }
        System.out.println();
    }

    public void takeBook(Book... nameBook) {
        System.out.println(this.fullName + " взял книги: " );
        for(int i = 0; i < nameBook.length; i++) {
            System.out.print( nameBook[i].getBook() + " ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(this.fullName + " вернул " + count + " книг");
    }

    public void returnBook(String... nameBook) {
        System.out.println(this.fullName + " Вернул книги: " );
        for(int i = 0; i < nameBook.length; i++) {
            System.out.print( nameBook[i] + " ");
        }
        System.out.println();
    }

    public void returnBook(Book... nameBook) {
        System.out.println(this.fullName + " Вернул книги: " );
        for(int i = 0; i < nameBook.length; i++) {
            System.out.print( nameBook[i].getBook() + " ");
        }
        System.out.println();
    }
}
