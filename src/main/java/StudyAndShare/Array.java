package StudyAndShare;

public class Array {
    public static void main(String[] args) {
        int [] arrayInt1 = new int[1000000];
        int [] arrayInt2 = {1,2,3,4};
        int [][] arrayInt3 = new int[2][3];
        System.out.println(arrayInt1.length);
        System.out.println(arrayInt2.length);
        System.out.println(arrayInt2[0]);

        for ( int i = 0; i < 2; i++ ) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayInt3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
