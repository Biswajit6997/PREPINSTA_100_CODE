public class LeaapYear {
    static void checckLeapYear(int n){
        if(n%400==0 || (n %4==0 && n%100!=0)){
            System.out.println("leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        int year=2024;
        checckLeapYear(year);
    }
}
