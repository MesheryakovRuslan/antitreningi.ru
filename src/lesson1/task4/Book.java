package lesson1.task4;

public class Book {
    private String name;
    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name) {
        this.name = name;
    }

    public String getBook() {
        return this.name + " авторства: " + this.author + ",";
    }
}

