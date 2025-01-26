public class pattern8 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("   ");
            }

            // Print numbers (first and last are always 1)
            for (int j = 0; j <= i; j++) {
              if (j==0 || j == i){
                  System.out.print("1    ");
              }else{
                   System.out.print(j + "    ");
              }

            }
             System.out.println();
        }
    }
}