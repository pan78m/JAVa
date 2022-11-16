
package classmethodobject;
//Sum of factorial numbers??
import java.util.Scanner;
public class Problem_14 {
    
    public static void main(String[] args) {
        int fact = 1, n,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Num: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println("Fact is: "+fact+" "+"\nSum is: "+sum);

    }
}
