import java.util.Scanner;

public class Upper_Lower {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Alphabet in Uppercase");
        char a=scanner.next().charAt(0);
        int i;
        i=(int)a;
        i=i+32;
        a=(char)i;
        System.out.println(a);

        // System.out.println("Enter the aLphabet in lowercase");
        //char a=scanner.next() .charAt(0);
        //int i;
        //i=(int)a;
        //i=i-32;
        //a=(char)i;
        //System.out.println(a);








    }
}
