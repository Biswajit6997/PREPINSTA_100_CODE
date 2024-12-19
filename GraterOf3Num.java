/*
 Find the Greatest of the Three Numbers in Java
Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
 
Example
Input : num1 = 12 num2 = 9 num3 = 14
Output : 14
 */


public class GraterOf3Num {
    static void Grater(int n1,int n2,int n3){

        if(n1>n2&& n1>n3){
            System.out.println(n1+" Is Grater ");
        }
        else if(n2>n3 && n2>n3){
            System.out.println(n2+" Is Grater ");


        }
        else{
            System.out.println(n3+" Is Grater");
        }

    }
    public static void main(String[] args) {
        int n1=100,n2=55,n3=15;
        Grater(n1, n2, n3);

    }
}
