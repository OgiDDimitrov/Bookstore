package bg.smg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookstore {
    private List<Book> books; // List е интерфейс, ArrayList е клас; books е обикновена променлива от тип List


    // constructors
    public Bookstore() {
        this.books = new ArrayList<>(); // прави празен списък с книги
    }

    public Bookstore(List<Book> books) {
        this.books = books;
    }

    public void sell(Book book){
        int av = book.getAvailable();
        if(av>0) {
            if (book.getType()==BookType.COMIC_BOOK) {
                System.out.print("Въведете % отстъпка за COMIC_BOOK: " );
                Scanner sc = new Scanner(System.in);
                double ots = sc.nextDouble();
                System.out.println("Продаваме книгата " + book.toString() + " на цена: " + book.getPrice(ots));
                book.getPrice(ots);
            }
            else System.out.println("Продаваме книгата " + book.toString() + " на цена: " + book.getPrice());
            book.setAvailable(av-1);
        } else {
            System.out.println("Няма налични бройки!");
        }
    }

    // getters and setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
