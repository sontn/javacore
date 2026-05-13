package StudyAndShare;

public class Unit23 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
    }
}

class Outer {
    public void show() {
        Inner in = new Inner();
        in.display();
    }


    class Inner{
        public void display() {
            System.out.println("Inner display");
        }
    }
}
