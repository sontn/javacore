package StudyAndShare;

public class Unit27 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.count);
    }
}

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}