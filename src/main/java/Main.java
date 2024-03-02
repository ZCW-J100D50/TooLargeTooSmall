import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        //declaring and initializing variable in range of 1 - 50
        int minValue = 1;
        int maxValue = 50;
        int guessCount = 0;

        //input from user
        Scanner input = new Scanner(System.in);

        // generate random number
        int secretNum = (int)(Math.random() * (maxValue-minValue + 1) +minValue);

        // set win to false,  it means the player hasn't won yet.
        boolean correct = false;

        while (!correct){
            System.out.println("Enter a number between " + minValue + " and " + maxValue + ": ");
            int userInput = input.nextInt();
            guessCount++;

            //if user input and secret num is same, print correct guess
            if(userInput == secretNum){
               // When win is true, then the player won the game.
               correct =true;
            } else if (userInput > secretNum) {
                System.out.println("Too large... try again");
            }else {
                System.out.println("Too small..Try again");
            }
        }

        System.out.println("You got Correct Guess!!");

        //counting the guess
        System.out.println("Number of guess: "+ guessCount);


        
    }
}
