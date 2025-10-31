package PerformanceLesson;

public class Main {
    public static void main(String[] args) {
        double start = System.nanoTime();
        int a = 10000000;
        double end = System.nanoTime();
        System.out.println("int time: " + (end -start) + " ns");

        start = System.nanoTime();
        Integer b = 100000;
        end = System.nanoTime();
        System.out.println("Integer time: " + (end - start) + " ns");
    }
}
