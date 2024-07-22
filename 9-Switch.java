
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Switch Statement");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit : ");
        String fruit = in .next();

        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");    
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");

  
        }

        // or you can use enhanced switch case
        /*  switch (fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        } */
    }
}
