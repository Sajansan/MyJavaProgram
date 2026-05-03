import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loops = a loop inside a loop

        Scanner scan = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = scan.nextInt();

        System.out.print("Enter # of column: ");
        columns = scan.nextInt();

        System.out.print("Enter symbol to use: ");
        symbol = scan.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
