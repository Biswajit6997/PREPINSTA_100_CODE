public class CountPrimeInRange {
     // Method to count and print prime numbers in a range
     static int countPrimesInRange(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (checkPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check if a number is prime
    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int n1 = 1, n2 = 20;
        int primeCount = countPrimesInRange(n1, n2);
        System.out.println("Number of prime numbers between " + n1 + " and " + n2 + ": " + primeCount);
    }
}
