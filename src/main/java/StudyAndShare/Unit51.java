package StudyAndShare;

public class Unit51 {
    public static void main(String[] args) {
        House<String> house1 = new House();
        house1.set("Hello");

        House<Integer> house2 = new House<>();
        house2.set(100);

        System.out.println(house1.get());
        System.out.println(house2.get());
    }
}

class House<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }


}
