import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        //int x = rand.nextInt(6) + 1;
        //double y = rand.nextDouble(5);

        boolean z = rand.nextBoolean();

        System.out.println(z);

    }
}