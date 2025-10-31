package ArrayIntLesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        for (int number : numbers ) {
            System.out.println(number);
        }

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(5);
        numbers1.add(4);
        numbers1.add(3);

        numbers1 = new LinkedList<>();
        numbers1.add(5);
        numbers1.add(4);
        numbers1.add(3);

        for (int number: numbers1) {
            System.out.println(number);
        }

    }
}
