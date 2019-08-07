import java.util.Scanner;

public class Find_Consonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any alphabet");
        char c=scanner.next().charAt(0);
        //given method will find you the given alphabet is VOWEL or CONSONANT
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            System.out.println("This alphabet is VOWEL");}
        else {
            System.out.println("This alphabet is Consonant");
        }
        }
    }

