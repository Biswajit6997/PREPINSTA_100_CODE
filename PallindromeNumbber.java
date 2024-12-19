public class PallindromeNumbber {
    // Approach 1
    static void checkPallindrome(int number) {
        int temp = number;
        int reverse = 0, rem;
        while (temp != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;

        }
        if (reverse == number) {
            System.out.println(+number + " Is a Palindrome number");

        } else {
            System.out.println(number + " Is not  a Palindrome number");

        }
    }
//Approach 2:
static void pallindrome(int num){
    int rev=0,rem;
    if (getReverse(num,rev)==num) {
        System.out.println(num+ " is a pallindrome number");
        
    }else{
        System.out.println(num+ " is not a pallindrome number");

    }
}
// helper method
static int getReverse(int number,int reverse){
  
    if (number==0) {
        return reverse;
        
    }
    int rem=number%10;
    reverse=reverse*10+rem; 
   
    return getReverse(number/10,reverse);
}
 //using recursion
 static int reverseA(int number){
    int rev=0;
    if (number==0) {
        return rev;
        
    }
    int rem=number%10;
    rev=rev*10+rem;
    return reverseA(number/10);
}
    public static void main(String[] args) {
        checkPallindrome(1251);
        pallindrome(121);

    }
}
