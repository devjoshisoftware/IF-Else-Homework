import java.util.Scanner;

public class Emp_Gross_Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Employee Id");
        int id=scanner.nextInt();
        System.out.println("Enter Employee Name");
        String name=scanner.next();
        System.out.println("Employee Salary");
        int salary=scanner.nextInt();
        //given condition will find HRA,DA,TA,PF and Gross salary of the employee.
        System.out.println("HRA" + "=" + (salary*10/100));
        System.out.println("DA" + "=" + (salary*8/100));
        System.out.println("TA" + "=" + (salary*9/100));
        System.out.println("PF" + "=" + (salary*20/100));

        System.out.println("Gross salary is" + (salary+(salary*10/100)+(salary*8/100)+(salary*9/100)-(salary*20/100)));



    }







}
