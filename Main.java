import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(5);
        int guess;


        System.out.println("Uzmini skaitli no viens līdz desmit: ");
        guess = input.nextInt();

        if (guess == number) {
            System.out.println("Tu uzminēji!");
        } else if (guess < number) {
            System.out.println("Pārāk mazs!");
        } else if(guess > number) {
            System.out.println("Pārāk liels!");
        }

    }
}