package InterfaceLesson;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("This is dog speaking");
    }

    @Override
    public void eat() {
        System.out.println("This is dog eating");
    }
}
