/*
 Find the Greatest of the Two Numbers in Java
Given two integer inputs N1 and N2, the objective is to write a code to Find the Greatest of the Two Numbers in Java. In order to do so we’ll compare the numbers using if-else statements.
 
Example
Input : num1 = 12 and num2 = 3
Output : 12
 */


public class GratestOf2Num {
    static void findGratest(int n1,int n2){
        if(n1==n2){
            System.out.println(" Numbers are Equal");
        }else if(n1>n2){
            System.out.println(n1 +" Is Grater");
        }else{
            System.out.println(n2+" Is Grater ");
        }
    }
    // 
    static void findGratest2(int n1,int n2 ){
        if (n1==n2) {
            System.out.println(" Numbers are Equal");
            
        }
        else{
            System.out.println(Math.max(n1, n2)+" Is Grater ");
        }
    }


    public static void main(String[] args) {
        int n1=10;
        int n2=5;
        // findGratest(n1, n2);
        findGratest2(n1,n2);
    }
}
