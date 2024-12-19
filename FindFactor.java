/*
 Find the Factors of a Number in Java
Given an integer number as the input, the objective is to Find all the factors of a Number. Therefore, we’ll write a code to Find the Factors of a Number in Java Language.

Example
Input : 10
Output : 1, 2, 5
 */

public class FindFactor {
    // Time Complexity : O(n)
    // Auxiliary Space : O(1
    static void findFact(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method 2 :
    // Time Complexity : O(n)
    // Auxiliary Space : O(1)
    // This method is better than previous method, even though the time complexity
    // is the same
    // it runs half lesser loop than previous method
    // ran for loop num times, however, this runs num/2 times
    static void getFactors(int n) {
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                System.out.println(i + " ");

            }
        }

    }

    

    public static void main(String[] args) {
        int n = 10;
        findFact(n);
        System.out.println("---------");
        getFactors(n);
    }
}
