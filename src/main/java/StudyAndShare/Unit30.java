package StudyAndShare;

import java.io.IOException;

public class Unit30 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[0] = 10;
            arr[1] = 0;
            arr[2] = 1;
            int c = arr[0] / arr[1];

        } catch (ArithmeticException e) {
            System.out.println("Khong the chia cho 0");
        } catch( ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }

    }
}
