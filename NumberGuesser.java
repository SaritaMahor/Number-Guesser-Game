import java.util.Random;
import java.util.Scanner;

public class NumberGuesser{
    public static void main(String[] args) {
        NumberGuesser numberGuesser = new NumberGuesser();

        numberGuesser.guessNum();
    }
    public void guessNum(){
        Random random = new Random();

        int computer = random.nextInt(100) + 1;

        System.out.print("Guess number between 1 to 100: ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            if(computer == user){
                System.out.println("*******You got it right*******");
                return;
            }
            else if(computer<user){
                System.out.println("Too High");
                System.out.print("Guess Again: ");
                user = sc.nextInt();
            }
            else{
                System.out.println("Too Low");
                System.out.print("Guess Again: ");
                user = sc.nextInt();
            }

        }
        System.out.println("OOPS!! You could not Guess in 10 attempts!!");
        System.out.println("Number was: " + computer);
        System.out.println("GAME OVER");
    }
}