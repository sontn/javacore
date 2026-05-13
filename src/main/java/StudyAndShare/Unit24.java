package StudyAndShare;

public class Unit24 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.show();
    }
}

interface Human {
    int AVG_AGE = 100;
    int AVG_WEIGHT = 60;

    void show();
    void sduty();
}

class Manager implements Human {

    @Override
    public void show() {
        System.out.println("AVG_AGE: " + AVG_AGE);

    }

    @Override
    public void sduty() {

    }
}