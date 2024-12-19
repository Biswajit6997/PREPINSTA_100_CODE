public class FindNthTermFibonacci {
    // Approch 1:
    static int findNthSeries(int n){
        if (n<=0) {
            return -1; 
            
        }
        if (n==1) {
            return 0;
            
        }
        if (n==2) {
            return 1;
            
        }
        int first=0,second=1;
        int next=0;
        for(int i=3;i<=n;i++){
            next=first+second;
            System.out.println("Iteration " + i + ": first = " + first + ", second = " + second + ", next = " + next);// optional 
            first=second;
            second=next;

        }
        return second;
    }
    
    //Approach 2:  using recursion
    static int findFib(int n){
        if(n<=1){
            return n;
        }
        return findFib(n-1)+findFib(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        // System.out.println(findFib(n));

        /*--------- */
        int result=findNthSeries(n);
        if (result!=-1) {
            System.out.println("Fibonacci number "+result);
            
        }
        else{
            System.out.println("Invalid input ");
        }
    }
}
