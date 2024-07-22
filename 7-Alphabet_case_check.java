
import java.util.Scanner;

public class Alphabet_case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        if (ch >='a' && ch <= 'z')
        {
            System.out.println("LowerCase");
        }
        else
        {
            System.out.println("UpperCase");
        }

    }
}
