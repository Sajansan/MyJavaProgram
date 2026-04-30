import java.util.Scanner;

public class WhileLoopPrac {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true

        Scanner scan = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your fucking name: ");
            name = scan.nextLine();
        }

        System.out.println("Hello " + name);
    }
}
