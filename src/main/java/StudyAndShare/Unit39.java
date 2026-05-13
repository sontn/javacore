package StudyAndShare;

public class Unit39 {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.getNumber());
        Box box1 = new Box(10);
        System.out.println(box1.getNumber());
    }
}

class Box {
    int number;

    Box() {
        number = 1;
        System.out.println("Thay doi phuong thuc khoi tao");
    }

    Box(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
}
