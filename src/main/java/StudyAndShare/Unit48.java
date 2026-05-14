package StudyAndShare;

import java.util.ArrayList;

public class Unit48 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.remove(2);
        System.out.println(list.get(0));
        for (String item : list) {
            System.out.println(item);
        }
    }
}
