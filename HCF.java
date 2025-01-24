public class HCF {
  static void CheckHCf(int num1, int num2) {
    while (num1 != num2) {

      if (num1 > num2) {
        num1 -= num2;

      } else {
        num2 -= num1;
      }
    }
    System.out.println("The HCF is " + num1);
  }
  // Using Recursion
  static int getHCF(int num1,int num2){
    // Handles the case when one of the number is 0 (num1) 
    // Check alert above in explanation
    if (num1==0) {
      return num2;
      
    }
    // Handles the case when one of the number is 0 (num2)
    // Check alert above in explanation
    if (num2==0) {

      return num1;
      
    }
    // base Case
    if (num1==num2) {
      return num1;
      
    }
    if (num1>num2) {
      return getHCF(num1-num2, num2);
      
    }
    return getHCF(num1, num2-num1);
  }

  public static void main(String[] args) {
    int num1 = 36, num2 = 60;
   CheckHCf(num1, num2);
   System.out.println(getHCF(num1, num2));
  }
}
