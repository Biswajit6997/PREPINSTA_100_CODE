/*
 For a input num1 and num2. This method uses two following observations –

LCM of two numbers will at least be equal or greater than max(num1, num2)
Largest possibility of LCM will be num1 * num2
When iterating in (i) We can linearly find an (i) that is divisible by both num1 & num2
 */

public class LCM {
    static int grtHCF(int num1,int num2)
    {
        while (num1!=num2) {
            if (num1>num2) {
                num1-=num2;
                
            }else{
                num2-=num1;
            }
            
        }
        return num1;
    }
    public static void main(String[] args) {
        int num1=12,num2=84;
        int hcf=grtHCF(num1, num2);
        System.out.println(hcf);
        
    }
    
}
