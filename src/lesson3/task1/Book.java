package lesson3.task1;

public class Book implements Printable {
    private String nameBook;

    Book(String nameBook){
        this.nameBook = nameBook;
    }

    public Book(){}
    @Override
    public void print() {
        System.out.println("Книга: " + this.nameBook);
    }

    public static void printBook(Printable[] printtables){
        System.out.println();
        System.out.println("Список только книг");
        for (int i = 0; i < printtables.length; i++){
            if(printtables[i] instanceof Book){
                System.out.println("Книга: " + ((Book) printtables[i]).getNameBook());
            }else{

            }
        }
        System.out.println();
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
