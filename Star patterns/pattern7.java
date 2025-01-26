public class pattern7 {
  public static void main(String[] args) {
    int rows = 4;
    for (int i = 1; i <= rows; i++) {
      // Print spaces
      for (int j = rows - i; j >= 1; j--) {
        System.out.print("   ");
      }

      // Print stars
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("* ");
      }
      System.out.println(); // Move to the next row
    }
  }
}