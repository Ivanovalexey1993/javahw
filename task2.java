
import java.util.Scanner;
 
class task2 {
    public static void task2(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int end = in.nextInt();
        double result = 1;
        
        for ( int i = 1; i <= end; i++ ) {
            result *= i;
        }
        System.out.println(result);
    }
}