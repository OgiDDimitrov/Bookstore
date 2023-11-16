package bg.smg;

public class ComicBook extends Book {
    private String characterName;


    // constructors
    public ComicBook() {
        super();
        this.characterName = "";
    }

    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName) {
        super(title, author, type, available, price);
        this.characterName = characterName;
    }



    @Override
    public String toString() {
        return "ComicBook{" +
                "characterName='" + characterName + '\'' +
                '}';
    }



    // getters and setters
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
