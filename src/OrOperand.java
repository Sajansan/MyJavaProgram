import java.util.Scanner;

public class OrOperand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit the game");

        String response = scan.next();

        if (! response.equals("q") && ! response.equals("Q")) {
            System.out.println("You are still playing the game");
        } else {
            System.out.println("You fucking quit the game.");

        }
    }
}
