package StudyAndShare;

public class Unit38 {
    enum COLOR {
        RED(1), BLUE(2), YELLOW(3), GREEN(4);
        private int value;
        COLOR(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(COLOR.BLUE.getValue());
    }
}
