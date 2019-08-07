import java.util.Scanner;

public class Alpha_City {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char a=scanner.next().charAt(0);
        //find the city names for given first alphabet by if or else
        if(a== 'a' || a== 'A'){
            System.out.println("Ahmedabad");
        }
    else if(a== 'b' || a== 'B'){
            System.out.println("Bombay");}
            else if(a== 'c' || a== 'C'){
                System.out.println("Calcutta");}
                else if(a== 'd' || a=='D'){
                    System.out.println("Delhi");}
                    else if(a== 'e' || a== 'E') {
                        System.out.println("East Ham");}
                        else if (a == 'f' || a=='F') {
                            System.out.println("France");}
           else{
            System.out.println("Invalid Entry");}


                    }

    }






