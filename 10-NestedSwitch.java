
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("Neasted Switch Case");
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){

            case 1 :
                System.out.println("kunal kushwaha");
                break;
            case 2 :
                System.out.println("rahul rana");
                break;
            case 3 :
                System.out.println("hayat murat");
                switch (department)
                {
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                       
                }
                break;
                default:
                    System.out.println("Enter Correct EmpID");
        }
    }
}
