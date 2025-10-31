package DateLesson;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = LocalDate.of(2018,10,20);
        LocalDate date3 = LocalDate.of(2018,10,20);
        if (date2.equals(date3)) {
            System.out.println("Hai ngay trung nhau");
        } else {
            System.out.println("Hai ngay khong trung nhau");
        }
    }
}
