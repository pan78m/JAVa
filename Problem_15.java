package classmethodobject;

import java.util.Scanner;

public class Problem_15 {

    public static void main(String[] args) {
        boolean isPrime;
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int c = 0;
       if (n < 2) {
           isPrime = false;
       } else {
           isPrime = true;
       }
       for (int i = 2; i <= n/i; i++) {
           if (n % i == 0) {
               isPrime = false;
               break;
           } 
       }
       if (isPrime) {
           System.out.println("Prime Number");
       } else {
           System.out.println("Not Prime Number");
       }
        // for (int i = 2; i < n; i++) {
        //     if (n % i == 0) {
        //         c++;
        //         break;
        //     }
        // }
        // if (c == 0) {
        //     System.out.println("IsPrime");
        // } else {
        //     System.out.println("NotPrime");
        // }

    }
}
