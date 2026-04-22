import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value x: ");
        x = scan.nextDouble();

        System.out.println("Enter the value z: ");
        y = scan.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is: " + z);

        scan.close();
    }
}
