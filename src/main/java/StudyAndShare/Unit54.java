package StudyAndShare;

public class Unit54 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {

                try {
                    System.out.println("Pause");
                    Thread.sleep(2000);
                    System.out.println("Restart");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        thread.start();

    }
}
