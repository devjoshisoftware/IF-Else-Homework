import java.util.Scanner;
//find the leap year by ternary operator
public class Find_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year");
        int y=scanner.nextInt();
        System.out.println("This Year is " + (((y%4==0) && (y%100!=0) || (y%400==0))? "Leap Year": "Not Leap Year"));


    }
}
