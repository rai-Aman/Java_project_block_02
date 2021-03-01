package Conditional_Statement;

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any moves (Rock,Paper,Scissor): If you want to exit the game type exit ");
            String playerOne = sc.next();

            if  (playerOne.equals("Exit")) {
                break;
            }

            if ( !playerOne.equals("Rock") &&  !playerOne.equals("Scissor") &&  !playerOne.equals("Paper")) {
                System.out.println("Invalid choice........");
            } else {
                System.out.println("Game started....");
                /*
                 * Generating 3 random number for rock,paper and scissor
                 */
                int randomNum = (int) Math.random() * 3;
                String playerTwo;

                if (randomNum == 0) {
                    playerTwo = "Rock";
                } else if (randomNum == 1) {
                    playerTwo = "Paper";
                } else {
                    playerTwo = "Scissor";
                }
                System.out.println("Opponent move:   " + playerTwo);

                if ( playerOne.equals(playerTwo)) {
                    System.out.println("Game tied...");
                } else if (( playerOne.equals("Rock") && playerTwo.equals("Scissor"))
                        || ( playerOne.equals("Scissor") && playerTwo.equals("Paper"))
                        || ( playerOne.equals("Paper") && playerTwo.equals("Rock"))) {
                    System.out.println("Congratulation You won the game......");

                } else {
                    System.out.println("You lost the game....");
                }

            }
            System.out.println("Thank you for playing the game.....");

            sc.close();

        }
    }
}