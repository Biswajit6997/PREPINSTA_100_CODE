/*
 Q 5: Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Example
Input : Number1 = 12 , Number2 = 15
Output : 54
 */

import java.util.Scanner;

public class SumOfGivenRange {
    //Method 1: Using Brute Force
    static int SumInRange(int n1,int n2){
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum+=i;
        }
        return sum;

    }
    //Method 2: Using the Formula
    static int SumInRange2(int n1,int n2){
       
        int result=n2*(n2+1)/2-n1*(n1+1)/2+n1;
        return result;
    }
    // Method 3: Using Recursion
    static int getSum(int sum,int n1,int n2){
        if(n1>n2){
            return sum;
        }
        return n1+ getSum(sum, n1+1, n2);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int n2=sc.nextInt();
        // System.out.println(SumInRange(n1, n2));12
        // System.out.println(SumInRange2(n1,n2));
        System.out.println(getSum(0, n1, n2));
        


        sc.close();

    }
    
}
