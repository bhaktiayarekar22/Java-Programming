
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        System.out.println("If - Else Statemt for salary and bonus");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Salary : ");
        int salary = in.nextInt();

        if (salary > 10000)
        {
          int bonus = 1000;
          salary = salary + bonus;
          System.out.println("New Salary : " + salary);
        
        }
        else if (salary > 20000)
        {
          int bonus = 2000;
          salary = salary + bonus;
          System.out.println("New Salary : " + salary);

        }
        else
        {
          int bonus = 100;
          salary = salary + bonus;
          System.out.println("New Salary : " + salary);
        }
    }
}
