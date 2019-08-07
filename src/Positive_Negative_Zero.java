import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the Digit");
        long num=scanner.nextLong();
        if(num>0){
            System.out.println("given Digit is POSITIVE");
        }
        else if(num<0){
            System.out.println("given Digit is NEGATIVE");
        }
        else{
            System.out.println("given Digit is ZERO");
        }




    }




}
