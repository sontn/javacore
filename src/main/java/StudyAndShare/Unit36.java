package StudyAndShare;

public class Unit36 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal {
//    @Override
    void sound() {
        System.out.println("Dog make a sound");
    }
}
