/*
 Find the Reverse of a Number in Java
Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order. We’ll use loops and recursion to reverse the number input. therefore, we’ll write a program to Find the Reverse of a Number in Java Language.

Example
Input : 123
Output : 321
 */

public class ReverseANum {
    //Using for loop
    static int reverse(int num) {
        int reverse = 0, rem;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        return reverse;

    }
    //using recursion
    static int reverseA(int number,int rev){
       
        if (number==0) {
            return rev;
            
        }
        int rem=number%10;
        rev=rev*10+rem;
        return reverseA(number/10,rev);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverseA(12345,0));

    }

}
