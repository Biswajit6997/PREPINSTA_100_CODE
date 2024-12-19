/*
 Find the Fibonacci Series up to Nth Term in Java
For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.

Example
Input : 4
Output : 0 1 1 2
 */
public class FibonacciSeries {
    static void findSeries(int num){
        int a=0,b=1;
        System.out.print(a+"  "+b+"  ");
        int nextTerm;
        for(int i=2;i<num;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm+"  ");
        }
        
    }
    // using recursion
    static int fibSeries(int n){
        if (n<=1) return n;
        return fibSeries(n-1)+fibSeries(n-2);
        

            
        
    }
    public static void main(String[] args) {
    //    findSeries(4);
       int n=10;
       for(int i=0;i<=n;i++){
        System.out.print(fibSeries(i)+" ");
       }
    }
    
}
