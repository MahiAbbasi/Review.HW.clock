package class11;

public class CatTester {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name="Pasha";
        cat1.breed="Persion";
        cat1.age=2;
        cat1.color="Gray";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2 = new Cat();
        cat2.name="skipy";
        cat2.breed="Persion";
        cat2.age=7;
        cat2.color="wight";
        cat2.attitude=false;
        cat2.Speak();

        System.out.println(cat2.breed);
        cat2.Speak();
        

    }
}
