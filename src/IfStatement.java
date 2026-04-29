import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 18 && age < 70) {
            System.out.println("You are an adult!");
        } else if (age >= 70) {
            System.out.println("Ok Boomer!");
        } else {
            System.out.println("You are a chick");
        }
    }
}
