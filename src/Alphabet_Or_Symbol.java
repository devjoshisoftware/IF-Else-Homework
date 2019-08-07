import java.util.Scanner;

public class Alphabet_Or_Symbol {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Value");
        char a=scanner.next().charAt(0);
        if((a>=65 && a<=90) || (a>=97 && a<=122)){
        System.out.println("The Value is Alphabet");}
        else if (a>=48 && a<=57){
        System.out.println("The Value is Digit");}
        else System.out.println("Value is Symbol");

        }

    }

