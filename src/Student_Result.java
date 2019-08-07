import java.util.Scanner;

public class Student_Result {

//enter details of the student
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String sn = scanner.next();
        System.out.println("Enter Roll no");
        int r = scanner.nextInt();
        System.out.println("Science mark");
        int sm = scanner.nextInt();
        System.out.println("Maths mark");
        int mm = scanner.nextInt();
        System.out.println("Physics mark");
        int pm = scanner.nextInt();
        //find the total mark,percentage and the result by ternary operator
        System.out.println("Total mark is " + (sm + mm + pm) + " & the percentage is " + ((sm + mm + pm) / 3) + "%");
        System.out.println("The result is " + (((sm + mm + pm) / 3) >= 35 ? "Pass" : "Fail"));
        if (((sm + mm + pm) / 3) >= 80) {
            System.out.println(" The Grade is A+ ");
        }
       else if (((sm + mm + pm) / 3) >= 60) {
        //    System.out.println(" The Grade is A ");
        }
        else if (((sm + mm + pm) / 3) >= 50) {
            System.out.println(" The Grade is B");
        }
        else if (((sm + mm + pm) / 3) >= 35) {
            System.out.println(" The Grade is C ");
        }
        else{}

       System.out.println( (sm>=35 && mm>=35 && pm>=35)? "Pass in all Subject": " Fail");


    }
}
