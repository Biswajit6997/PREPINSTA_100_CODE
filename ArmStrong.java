/*
 Check whether or Not the Number is an Armstrong Number in Java
Given an integer input the objective is to check whether or not the number is an Armstrong number. To do so we check if the number satisfies the below mentioned conditions and if it does, the it’s an Armstrong. The task is to write a code to Check Whether or Not the Number is an Armstrong Number in Java Language.

Example
Input : 371
Output : It's an Armstrong Number.
 */


public class ArmStrong {
    // Method 1:
    static boolean CheckArmStrong(int number){
        int orginalnum=number;
        int result=0;
        int n=String.valueOf(number).length();
        
        while (number>0) {
            int digit=number%10;
            result+=Math.pow(digit, n);
            number/=10;
            
        }
        return result==orginalnum;
        
    }
    // Method 2:
    static int power(int base,int expo){
        int result=1;
        for(int i=0;i<expo;i++){
            result*=base;
        }
        return result;
    }
    // Method to check if a number is an armstrong number
    static boolean isArmStrong(int number){
        int orginalnum=number;
        int n=0;
        int temp=number;
        // Count the number of digit
        while (temp>0) {
            temp/=10;
            n++;
            
        }
        int sum=0;
        temp=number;
        // Calculate sum of the powers of the digit
        while (temp>0) {
            int digit=temp%10;
            sum+=power(digit, n);
            temp/=10;
            
        }
        return sum==orginalnum;
    }

    public static void main(String[] args) {
        int num=153;
        // if (CheckArmStrong(num)) {
            if (isArmStrong(num)) {
                
            
            System.out.println(num+"  is ArmStrong Number");
            
        }else{
            System.out.println(num+" IS Not a ArmStrong Number ");
        }
        
    }
    
}
