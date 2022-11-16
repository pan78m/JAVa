package classmethodobject;

import java.util.Scanner;
//Fibonacci Digit count ??

public class Problem_13 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 1, sum = 0, d=0, e=0;
        //int[]ar=new int[];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Num: ");
        int n = s.nextInt();
         int[]ar=new int[n+1];
        int Given = s.nextInt();
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
            ar[i] = a;
            sum += a;
            for (int j = 2; j <= n; j++) {
                if (ar[i] + ar[j] == Given) {
                    d= ar[i];
                    e= ar[j];
                  
                }
            }
           
        }
         System.out.println("\nA: " + d + " " + "\nB: " + e);
        System.out.println("Sum: " + sum + " ");
    }
}
