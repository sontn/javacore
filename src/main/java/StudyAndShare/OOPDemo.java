package StudyAndShare;
 class OOPDemo {
}
class Student {
    private String name;

    public void study() {

    }

    public static void main(String[] args) {
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("Employee work");
            }
        };
        e.test();
    }
}

interface Person  {
    String COUNTRY_NAME = "Viet Nam";
    public void show();
}

abstract class Employee{
    private String name;

    public abstract void work();
    public void test() {
        System.out.println("Employee does jobs");
    }
}