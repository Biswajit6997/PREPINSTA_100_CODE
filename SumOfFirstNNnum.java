/*
 Q3. Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,
 */

import java.util.Scanner;

public class SumOfFirstNNnum {
    //Using Loop
    static int findSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        return sum;
    }
    //Usinng forrmula
    static int findSum2(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }
    //Using Recursion
    static int findSum3(int n){
        if(n==0){
            return n;
        }
        else return n+findSum3(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr a number :");
        int n=sc.nextInt();
        // System.out.println(findSum(n));
        // System.out.println(findSum2(n));
        System.out.println(findSum3(n));
        sc.close();

    }
}
