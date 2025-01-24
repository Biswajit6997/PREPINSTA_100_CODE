/*
 Check Whether Or Not the Number is an Automorphic Number in Java
Given an integer input, the Objective is to check whether the square of the number ends with the same number or not. Therefore, we’ll write a code to Check Whether or Not the Number is an Automorphic Number in Java Language.

Example
Input : 5
Output : Yes, it's an Automorphic Number
 */


public class Automorphic {
    public static void main(String[] args) {
        int n=25;
        int squaer=n*n;
        if(isAutoMorphic(n)==1){
            System.out.println("Num "+ n+", Square: "+squaer+" - is AutoMorphic");
        }else{
            System.out.println("Num "+ n+", ,Square: "+squaer+" - is not AutoMorphic");

        }
    }
    static int isAutoMorphic(int n){
        int square=n*n;
        while (n!=0) {
            if(n%10!=square %10){
                return 0;
            }
            n/=10;
            square/=10;

            
        }
        return 1;
    }
}
