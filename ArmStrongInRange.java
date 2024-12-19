/*

Armstrong Numbers between Two Intervals using Java
Armstrong numbers between two intervals IN JAVA
Find the Armstrong Numbers in a given Interval in Java
Given two integers high and low for limits as inputs, the objective is to write a code to Find the Armstrong Numbers in a given Interval in Java.

Example 
Input : 10 1000
Output : 153  370  371  407
 */ 


public class ArmStrongInRange {
    static boolean isArmStrong(int number){
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
    // Range found 
    static void findArmStrong(int start,int end){
        for(int i=start;i<=end;i++){
            if (isArmStrong(i)) {
                System.out.print(i+" ");
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        findArmStrong(10, 10000);                                                  
    }
    
}
