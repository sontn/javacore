package LambdaLesson;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        numbers.forEach( (n) -> System.out.println(n));
    }
}
