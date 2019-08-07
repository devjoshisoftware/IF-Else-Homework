import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int a=scanner.nextInt();
        System.out.println("Enter Second number");
        int b=scanner.nextInt();
        System.out.println(" Choose the Symbol from (+,-,/,*)");
        String symbol=scanner.next();
        if(symbol.equals("+")){
            System.out.println(a+b); }
        else if(symbol.equals("-")){
            System.out.println(a-b);}
        else if(symbol.equals("*")){
                System.out.println(a*b);}
        else if(symbol.equals("/")){
            System.out.println(a/b);}
        else{}




    }
}