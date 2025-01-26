public class pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
             for (int j = 0; j <= i; j++) {
                System.out.print((j % 2 == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}