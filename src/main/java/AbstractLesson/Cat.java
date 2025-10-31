package AbstractLesson;

public class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meo!");
    }

    void eat() {
        System.out.println("cat eats fish");
    }
}
