/*
 Check Whether or Not the Number is a Strong Number in Java
Given an integer  input the objective is to check whether or not the number is a strong number. Therefore we’ll write a code to Check whether or Not the Number is a Strong Number in Java Language.

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
 */

public class StrongNum {
    static int findFact(int num){
        if (num==0) {
            return 1;
            
        }
        return num*findFact(num-1);
        
    }
    static boolean StrongNumCheck(int number){
        int temp=number;
        int sum=0, digit;
        while (temp!=0) {
            digit=temp%10;
            sum+=findFact(digit);
            temp/=10;
            
        }
        return sum==number;

    }
    public static void main(String[] args) {
        int num=1450;
        if (StrongNumCheck(num)) {
            System.out.println(num +" is a Strong number");
            
        }else{
            System.out.println(num +" is not  a Strong number");

            
        }

    }
    
}
