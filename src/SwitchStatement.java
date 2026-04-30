import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = scan.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Friday":
                System.out.println("It is fucking Friday");
                break;
            case "Monday":
                System.out.println("It is fucking Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            default:
                System.out.println(day + " is not a day.");
        }
    }
}