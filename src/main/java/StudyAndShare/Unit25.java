package StudyAndShare;

public class Unit25 {
    public static void main(String[] args) {
        Boss bo = new Boss();
        bo.age = 45;
        bo.name = "Son Tran";
        bo.address = "VN";
        bo.getNumberOfWives();

    }
}

class Boss{
    public int age;
    protected String name;
    String address;
    private int numberOfWives;

    public int getNumberOfWives() {
        return numberOfWives;
    }
}


