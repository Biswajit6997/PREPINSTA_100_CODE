public class BinaryToDecimal {
    static void BinToDec(int num){
        int decimal=0;
        int n=0;
        while (num>0) {
            int temp=num%10;
            decimal+=temp*Math.pow(2, n);
            num=num/10;
            n++;
            
        }
        System.out.println("Decimal Number is "+decimal);
    }
    static int ConvertBinToDec(String num){
        int decimal=Integer.parseInt(num,2);
        return decimal;
    }
    public static void main(String[] args) {
        String a="101";
        System.out.println(ConvertBinToDec(a));
        BinToDec(101);
    }
}
