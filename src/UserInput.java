import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("what is your fav food?");
        String answer = sc.nextLine();

        System.out.println("My fav food is "+ answer);
    }
}