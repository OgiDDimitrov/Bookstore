package bg.smg;

public class ChildrenBook extends Book {
    private int age;


    public ChildrenBook() {
        super(); //ще го извика под разбиране (не е задължителен)
        this.age = 0;
    }

    public ChildrenBook(String title, Author author, BookType type, int available, double price, int age) {
        super(title, author, type, available, price);
        this.age = age;
    }


    @Override
    public String toString() {
        return "ChildrenBook{" +
                "age=" + age +
                '}';
    }


    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
