import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int n;
        n = 1+random.nextInt(101);

        int guess = 0;

        int attempts = 1;
        System.out.println("Guess the random number 1-100.");

        while ( guess != n){

            attempts ++;

            guess = input.nextInt();
            if(guess < n){
                System.out.println("You guessed to low.");
            }
            else if(guess > n){
                System.out.println("You guessed to high.");
            }
            else{
                System.out.println("you got it right! It took you "+ attempts +" attempts to the answer right.");
            }
        }

    }
}