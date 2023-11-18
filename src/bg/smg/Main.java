package bg.smg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        System.out.print("Въведете брой книги: ");
        Scanner sc = new Scanner(System.in);
        int numBooks = sc.nextInt();

        for(int i=0 ; i < numBooks; i++) {
            Book book = null;
            int type=4;
            while (type<1 || type>3) {
                System.out.print("Въведете тип книга: '1'-Book/'2'-Children_book/'3'-Comic_book> ");
                //BookType bbtype = BookType.COMIC_BOOK;
                type  = sc.nextInt();

                switch(type) {
                    case 2: book = new ChildrenBook();
                        book.setType(BookType.CHILDREN_BOOK);
                        System.out.print("Моля въведете възраст, за която е предназначена книгата: ");
                        /* ComicBook comicBook=(ComicBook) book;
                        comicBook.setCharacterName(sc.next());*/
                        ((ChildrenBook)book).setAge(sc.nextInt());
                        break;
                    case 3: book = new ComicBook();
                        book.setType(BookType.COMIC_BOOK);
                        System.out.print("Моля въведете име на героя: ");
                        /* ComicBook comicBook=(ComicBook) book;
                        comicBook.setCharacterName(sc.next());*/
                        ((ComicBook)book).setCharacterName(sc.next());
                        break;
                    case 1: book = new Book(); break;
                    default:
                        System.out.println("Не въведохте тип книга <тип - Book/Children_book/Comic_book> ");
                }
            }


            System.out.print("Въведете бройка налични книги: ");
            book.setAvailable(sc.nextInt());

            System.out.print("Въведете заглавие на книгата: "); // зачита само първата дума от заглавия с повече от една дума
            book.setTitle(sc.next());

            Author author = new Author(); // слага името и възрастта заедно, не ги отделя, но само при въведено заглавие разделно

            System.out.print("Въведете име на автора: ");
            author.setName(sc.next());

            book.setAuthor(author);

            System.out.print("Въведете възраст на автора: ");
            author.setAge(sc.nextInt());

            System.out.print("Въведете оригинална цена на книгата: ");
            book.setOriginalPrice(sc.nextDouble());

            /* if(book instanceof ChildrenBook) {
                System.out.println("Въведете възраст, за която е предназначена книгата: ");
                ((ChildrenBook) book).setAge(sc.nextInt());
            } else if (book instanceof ComicBook) {
                System.out.println("Въведете име на героя: ");
                ((ComicBook) book).setCharacterName(sc.next());
            } */


            books.add(book);

        }


        Bookstore store = new Bookstore();
        store.setBooks(books);

        for(int i=0 ; i < numBooks; /*i++*/ i+=2) {
            Book book = books.get(i);
            store.sell(book);
        }
        sc.close();

    }
}