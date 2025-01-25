import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.print("Enter the number to print table : ");
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.close();
        int i = 1;
        do{
            System.out.println( i*num);
            i++;
        }while(i<=10);
            
        }
    }
    

