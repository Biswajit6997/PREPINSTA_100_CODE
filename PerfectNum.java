/*
 Check Whether or Not the Number is a Perfect Number in Java
Given an integer input as the number, the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.

Example
Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors)
 */

public class PerfectNum {
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static void checkPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");

        } else {
            System.out.println(number + " is not a perfect number");

        }
    }

    public static void main(String[] args) {
        int n = 6;
        checkPerfect(n);
    }

}
