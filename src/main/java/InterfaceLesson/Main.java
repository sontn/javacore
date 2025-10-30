package InterfaceLesson;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.speak();
        dog.eat();

        Animal cat = new Cat();
        cat.speak();
        cat.eat();
    }
}
