import java.util.Scanner;

public class Average_Five {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number");
       int a = scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        System.out.println("Enter the Third number");
        int c = scanner.nextInt();
        System.out.println("Enter the Fourth number");
        int d = scanner.nextInt();
        System.out.println("Enter the Fifth number");
        int e = scanner.nextInt();
        //the method returns Average of given numbers
        System.out.println("Average is" + ((a+b+c+d+e)/5));



    }



}
