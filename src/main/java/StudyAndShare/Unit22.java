package StudyAndShare;

public class Unit22 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.setName("a1");
        a2.setName("a2");

        System.out.println(a1.getName());
        System.out.println(a2.getName());

        B b1 = new B();
        B b2 = new B();
    }
}

class A {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class B {

}