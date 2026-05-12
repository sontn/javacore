package StudyAndShare;

public class Demo {
    private int a;

    private static int total;

    public void doSmt() {
        a = 1;
        System.out.println("a: " + a);
    }

    public int increaseOne() {
        return ++total;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.doSmt();
        demo.increaseOne();
        demo.increaseOne();
        demo.increaseOne();
        System.out.println(demo.increaseOne());

    }
}
