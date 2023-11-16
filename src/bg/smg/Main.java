package bg.smg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int numberAnimals = sc.nextInt();

        for(int i = 0 ; i< numberAnimals; i++) {
            Book book;
            System.out.println("Въведете данни за животно: <тип-Cat/Dog/Duck/Fish/HummingBird/Zebra> <име> <възраст> <цвят> <пол> <вид храна-МЕАТ/NUTS/FISH_FOOD/GRASS> <диво ли е> <бр крака>");
            AnimalType type = AnimalType.valueOf(sc.next().toUpperCase());
            switch(type) {
                case CAT: book = new Cat(); break;
                case DOG: book = new Dog(); break;
                default: book = new Book();
            }
            book.setType(type);
            book.setName(sc.next());
            book.setAge(sc.nextInt());
            book.setColor(sc.next());
            book.setGender(sc.next());
            BookType foodType = FoodType.valueOf(sc.next().toUpperCase());
            book.setFood(foodType);
            book.setWild(sc.nextBoolean());
            book.setNumberOfLegs(sc.nextShort());
            animals.add(book);
        }

        for(int i =0;i<numberAnimals;i++) {
            Animal animal = animals.get(i);
            animal.feed();
            animal.speak();
        }
        sc.close();

    }
}