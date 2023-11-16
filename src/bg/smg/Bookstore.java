package bg.smg;
import java.util.ArrayList;
import java.util.List;
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
        if(av>0){
            System.out.println("Prodavame...." + book.toString() + book.getPrice());
            book.setAvailable(av-1);
        } else {
            System.out.println("nqma....");
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
