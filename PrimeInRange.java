/*
 Find the Prime Numbers in a Given Interval in Java
Given an integer input the objective is to check whether or not there are any Prime Numbers in the given interval or range. Therefore, we write a code to Find the Prime Numbers in a Given Interval in Java Language.

Example
Input : 2 10
Output : 2 3 5 7
 */

public class PrimeInRange {
    static void PrimeInRannge(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            
            if (checkprime(i)) {
                System.out.println(i);
            }
        }
    }

    // helper method
    
    static boolean checkprime(int n) {
        if (n < 2){
            
            return false;
        }
        
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // // Helper function
    // static boolean isPrime(int n) {

    //     // 0, 1 negative numbers are not prime
    //     if (n < 2)
    //         return false;

    //     // checking the number of divisors b/w 1 and the number n-1
    //     for (int i = 2; i < n; i++) {
    //         if (n % i == 0)
    //             return false;
    //     }

    //     // if reached here then must be true
    //     return true;
    // }

    public static void main(String[] args) {
        int n = 1, m = 20;
        PrimeInRannge(n, m);

    }

}
