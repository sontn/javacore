package InterfaceLesson;

public class Cat implements Animal{


    @Override
    public void speak() {
        System.out.println("This is cat speaking");
    }

    @Override
    public void eat() {
        System.out.println("THis is cat eating");

    }
}
