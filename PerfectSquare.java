
/*
 Check for Perfect Square in Java
Here on this page, we will learn how to Check for Perfect Square in Java programming language. We are given an integer number and need to print “True” if it is, otherwise “False”.

 */

public class PerfectSquare {
    //Method 1
    static boolean isPerfect(int number){
        if(number>=0){
            int sr=(int)Math.sqrt(number);
            return ((sr*sr)==number);

        }
        return false;
    }
    //Method -2
    static void checkPerfect(int num){
        if(Math.ceil((double)Math.sqrt(num))==Math.floor((double)Math.sqrt(num)))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        int n=49;
        System.out.println(isPerfect(n));
        checkPerfect(n);
        
    }
}
