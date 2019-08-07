import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age");
int age=scanner.nextInt();
//BELOW ONE IS SECOND SOLUTION BY IF OR ELSE
//if(age>=18){
  //  System.out.println("Eligible for Voting");}
//else{
  //  System.out.println("Not Eligible");}
       //FIND THE ELIGIBILITY FOR VOTING BY TERNARY OPERATOR
        System.out.println(age>=18? "Eligible For Voting": "Not Eligible for Voting");




    }


}









