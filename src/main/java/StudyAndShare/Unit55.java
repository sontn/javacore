package StudyAndShare;

public class Unit55 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            Thread t = new Thread(new MyTask(i));
            t.start();
        }
    }
}

class MyTask implements Runnable {
    private int id;
    public MyTask(int id) {
        this.id = id;
    }
    public void run() {
        for ( int i =1; i <=5; i++) {
            System.out.println("Thead " + id + " - step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}