public class Factorial {
    // Iterative Approach
    static int fact(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    // Recursive Approach
    static int findFact(int n) {
        if (n == 0) {
            return 1;

        }
        if (n == 1) {
            return 1;

        }
        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFact(n));
        System.out.println(fact(n));

    }
}
