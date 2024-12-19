/*
Find the Sum of the Digits of a Number in Java
Given an integer input number, the objective is t0 Find the Sum of the Digits of a Number in Java Language. To do we’ll break the number into it’s digits. Then we add them one by one as we extract them from the number using modulo operator “%”.

Example
Input : 1234
Output : 1 + 2 + 3 + 4 = 10

 */

public class SumOfDigits {
    // Brute Fore Approach
    static int findSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;

        }
        return sum;
    }
    // Using recursion
    static int getSum(int num){
        if(num==0)
        {
            return 0;
        }
        return (num%10)+getSum(num/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(findSum(n));
        System.out.println(getSum(n));

    }

}
