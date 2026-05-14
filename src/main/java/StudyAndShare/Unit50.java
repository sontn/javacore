package StudyAndShare;

import java.util.ArrayList;

public class Unit50 {
    public static void main(String[] args) {
        ArrayList<C> al = new ArrayList<C>();
        al.add(new C());
//        al.add(new D());
        for (int i = 0; i < al.size(); i++) {
            al.get(i).show();
        }
    }
}

class C {
    public void show() {

    }
}

class D {
    public void go() {

    }
}
