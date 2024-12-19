/*
 Find the Power of a Number in Java
Given two integer inputs as number and the power, the objective is to raise the number to a power given. Therefore, we’ll write a Code to Find the Power of a Number in Java Language.

Example
Input : 2 3
Output : 8
 */

public class PowerOfNum {
    // Using the Math.pow() Method
    static double findPower(int a,int b){
        
        return Math.pow(a, b);
    }
    // Using Iterative Approach
    static int findPowerItr(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;

    }
    // Using recursion
    static int findPowerRec(int a,int b){
        if (b==0) {
            return 1;
            
        }
        return a*findPowerRec(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println(findPower(0, 3));
        System.out.println(findPowerItr(2, 3));
        System.out.println(findPowerRec(5,2));
        
    }
    
}
