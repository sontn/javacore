package ExceptionLesson;

public class Main {

    public static int[] getMang() {
        return new int[] {1,2};
    }

    public static void main(String[] args) {

        int[] mang = getMang();
        try {
//            System.out.println(mang[0]);
            System.out.println(mang[2]);
        } catch( ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi " + e);
        } catch (Exception e ) {
            System.out.println("Loi 2 " + e);
        } finally {
            System.out.println("Day la finally");
        }

        System.out.println("Ket thuc");
    }
}
