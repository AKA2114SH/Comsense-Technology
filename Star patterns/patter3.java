public class patter3 {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            for (int star = 5; star>line;star--){
                System.out.print("*");
            }
        
            System.out.println();
        }
    }
}