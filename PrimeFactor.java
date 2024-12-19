/*
 Prime Factors of a number in Java
 

Here, in this page we will discuss the program to print all the prime factors of a number in java. Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.

Example :

Input : 12
Output : 2 2 3
 */


public class PrimeFactor {
    //Method 1:
    // Check if the number is Prime
    static int CheckPrime(int num){
       
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return 0;
                
            }
        }
        return 1;
    }
    // MEthod to find the Prime Factor
    static void PrimeFactor(int n){
        for(int i=2;i<=n;i++){
            if (CheckPrime(i)==1) {
                int x=n;
                while (x%i==0) {
                    System.out.println(i+" ");
                    x/=i;
                    
                }
                
            }
        }
    }

    // Method 2:
    static void findPrimeFactor(int number){
        // Handle the factor of 2
        while (number%2==0) {
            System.out.println(2+" ");
            number/=2;
            
        }
        // check for odd factors
        for(int i=3;i<=Math.sqrt(number);i++){
            while (number%i==0) {
                System.out.println(i+ " ");
                number/=i;
                
            }
        }
        // if the remaining number is a prime grater than  2
        if (number>2) {
            System.out.println(number);

            
        }
    }
    // Method 3:
    public static void findPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) { // Check divisibility
                System.out.print(i + " "); // Print factor
                number /= i; // Reduce the number
            }
        }
    }


    public static void main(String[] args) {
        PrimeFactor(90);// 2 3 3 5
        System.out.println("----------");
        findPrimeFactor(100);
        System.out.println("----------");
        findPrimeFactors(55);

    }
}
