package StudyAndShare;

public class Unit32 {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Ban chua du 18 tuoi");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
