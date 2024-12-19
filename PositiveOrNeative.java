/*
Q1.
 Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.

 */

import java.util.Scanner;

public class PositiveOrNeative{
    static void findPostive(int n){
        if (n>0) {
            System.out.println("The number is Positive Number");
            
        }else if(n==0){
            System.out.println("Numberr is zero");
        }else{
            System.out.println("Nuber is Negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        findPostive(n);
        sc.close();

    }
}