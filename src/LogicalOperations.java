import java.util.Scanner;

public class LogicalOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temp: ");
        int temp = scan.nextInt();

        if (temp > 30) {
            System.out.println("It's hot outside.");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It's warm outside.");
        } else {
            System.out.println("It's fucking cold outside!");
        }
    }
}
