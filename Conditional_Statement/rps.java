package Conditional_Statement;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int losses = 0;

        while (true) {
            System.out.println(
                    "Enter your move at first (i.e., Rock, Paper and Scissor). If you want to exit the type quit:");
            String myMove = sc.nextLine();

            if (myMove.equals("quit")) {
                break;
            }
            /*
             * Checking either the user's move is valid or not:
             */
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissor")) {
                System.out.println("Your move is not valid.");
            } else {
                System.out.println("Your move is valid.");
                System.out.println("Let's start the Game: Rock, Paper and Scissor");
                /*
                 * Generating an random number for random input:
                 */
                int randNum = (int) Math.random() * 3;
                String opponentMove;

                if (randNum == 0) {
                    opponentMove = "rock";
                } else if (randNum == 1) {
                    opponentMove = "scissor";
                } else {
                    opponentMove = "paper";
                }

                System.out.println("Opponent Move: " + opponentMove);

                /*
                 * Calculating an either user's lost or tied or won the game:
                 */

                if (myMove.equals(opponentMove)) {
                    System.out.println("Game is tie");
                } else if ((myMove.equals("rock") && opponentMove.equals("scissors"))
                        || (myMove.equals("scissors") && opponentMove.equals("paper"))
                        || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won the game.");
                    win++;

                } else {
                    System.out.println("You lost the game.");
                    losses++;
                }
            }
            System.out.println("You wins " + win + " games !");
            System.out.println("You losses " + losses + " games !");

        }
        /*
         * Check to see if the suer has won more games than the user lost, or lost more
         * games than user won, of if they were equal.
         */
        if(win > losses){
            System.out.println("You won more games than you loses.");
        }else if(win < losses){
            System.out.println("You losses more games than you won.");
        }else{
            System.out.println("You won and lost an equal number of games.");
        }
        
        System.out.println("Thank for playing Game.");

        sc.close();

    }
}

//Checking in gitbash
    

