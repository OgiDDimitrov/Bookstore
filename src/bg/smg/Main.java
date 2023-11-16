package bg.smg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int numBooks = sc.nextInt();

        for(int i = 0 ; i< numBooks; i++) {
            Book book;
            System.out.println("Въведете tip kniga: <тип-Book/Children_book/Comic_book> ");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch(type) {
                case CHILDREN_BOOK: book = new ChildrenBook(); break;
                case COMIC_BOOK: book = new ComicBook(); break;
                default:
                    System.out.println("Vuvedohte.....");
                    book = new Book();
                    break;
            }
            System.out.println("");
            book.setAvailable(sc.nextInt());

            System.out.println("");
            book.setTitle(sc.next());

            System.out.println("");
            Author author = new Author();
            author.setName(sc.next());

            System.out.println("");
            author.setAge(sc.nextInt());

            book.setAuthor(author);
            book.setOriginalPrice(sc.nextDouble());

            if(book instanceof ChildrenBook) {
                System.out.println("");
                ((ChildrenBook) book).setAge(sc.nextInt());
            } else if (book instanceof ComicBook) {
                System.out.println("");
                ((ComicBook) book).setCharacterName(sc.next());
            }

            books.add(book);
        }


        Bookstore store = new Bookstore();
        store.setBooks(books);

        for(int i =0;i<numBooks;i+=2) {
            Book book = books.get(i);
            store.sell(book);
        }
        sc.close();

    }
}