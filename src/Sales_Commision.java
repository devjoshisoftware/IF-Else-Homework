import java.util.Scanner;

public class Sales_Commision {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales Id");
        int id=scanner.nextInt();
        System.out.println("Enter Saller's Name");
        String name=scanner.next();
        System.out.println("Enter Sales Amount");
        double sa= scanner.nextDouble();
        System.out.println("Enter the Basic Salary");
        double bs=scanner.nextDouble();
        //below method will find the commision depend on sales Amount.
        if(sa>=50000){
            System.out.println("The commision is" + (sa*35)/100); }
        else if(sa>=30000){
            System.out.println("The commision is" + (bs*20)/100);}
        else if(sa>=20000){
            System.out.println("The commision is" + (bs*10)/100);}
        else if(sa>=10000){
            System.out.println("The commision is" + (bs*5)/100);}
        else if(sa<10000){
            System.out.println("The commision is" + (bs*2)/100);}






    }
}
