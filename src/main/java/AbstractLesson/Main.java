package AbstractLesson;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Micky");
        dog.makeSound();

        Animal cat = new Cat("Katty");
        cat.makeSound();

//        cat.eat();
    }
}
