/*
 Check Whether a Given Number is Prime or Not in Java
Given an integer input greater than 0. The objective is to Check Whether or Not the Number is a Prime. To do so we’ll write a code to Check Whether a Given Number is Prime or Not in Java that checks for the factors of the Number besides 1 and the number itself.

Example
Input : 23
Output : Prime
 */



public class Prime {
    // Method 1
    static void PrimeOrNot(int n){
        boolean isPrime=true;
        if(n<2){
            isPrime= false;
            

        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        String result=isPrime?"Prime ":" Not Prime";
        System.out.println ("The number " + n + " is : " + result);
       
        
    }

    //Method 2:Optimization
    static void ChekPrime(int n){
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if (n%i==0) {
                isPrime=false;
                break;
                
            }
        }
        String result = isPrime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);
     // Time Complexity : O(N)
     // Space Complexity : O(1)
     // This program is better than previous version as :
     // Loops runs b/w [2, bn] rather than [2, n/2]
    }

    public static void main(String[] args) {
        int n=13;
        // PrimeOrNot(n);
        ChekPrime(n);

    }
    
}
