import java.util.Scanner;

public class HypotenuseCalcul {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        String TriName;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the triangle: ");
        TriName = scan.nextLine();

        System.out.print("Enter the first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scan.nextDouble();

        num3 = Math.sqrt((num1 * num1) + (num2 * num2));

        System.out.println("The hypotenuse of triangle " + TriName + " is: " + num3);
    }
}








