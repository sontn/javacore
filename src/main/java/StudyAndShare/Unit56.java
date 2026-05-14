package StudyAndShare;

public class Unit56 {
    public static void main(String[] args) throws InterruptedException {
        CounterDemo counter = new CounterDemo();
        Thread t1 = new Thread(() -> run(counter));
        Thread t2 = new Thread(() -> run(counter));
        Thread t3 = new Thread(() -> run(counter));
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(counter.getCount());

    }
    static void run(CounterDemo counter) {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class CounterDemo {
    int count = 0;
    public void increment() {
        count++;
    }
    public int getCount() {
        return this.count;
    }
}