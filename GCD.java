import java.util.Scanner;

public class GCD {

    static int findGcd(int a,int b){
        while (b!=0) {
            int reminder=a%b;
            a=b;
            b=reminder;
            
        }
        return a;
    }
    // Using Recursion

    static int findGD(int a,int b){
        if (b==0) {
            return a;
            
        }
        return findGD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=findGD(a, b);
       System.out.println( result);
    //    1st approach
       System.out.println(findGcd(a, b));


    }
}
