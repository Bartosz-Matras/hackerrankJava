package TicTacToeApplication;

import java.util.Scanner;

public class TicTacToeApplication {
    public static void main(String[] args) {
        //Getting input
        Scanner scanner = new Scanner(System.in);

        // Allows for cont. games
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay){
            // Setting up our tokens and AI
            System.out.println("Welcome to Tic Tac Toe! You are about to go against "
                            + "the master of Tic Tac Toe. Are you read? I hope so!\nBUT FIRST, you"
                            + " must pick what character you want to be and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board: ");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board: ");
            char opponentToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // Set up the game
            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number and your token shall be put"
                    + " in its place.\nThe number gor from 1-9, left to right. Well shall se who will win this round.");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("notOver")){
                if (game.currentMarker == game.userMarker){
                    // USER TURN
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scanner.nextInt();
                    while (!game.playTurn(spot)){
                        System.out.println("Try again. " + spot + " is invalid. This spot is already taken"
                                    + " or it is out of range.");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                }else{
                    // AI turn
                    System.out.println("It's my turn!");
                    // Pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }

                // Print out the board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            // Set up a new game... or not depending on the response
            System.out.println("Dou you want to play again? Enter Y if you do."
                            + " Enter anything else if you are tired of me.");

            char response = scanner.next().charAt(0);
            doYouWantToPlay = (response == 'Y' || response == 'y');
            System.out.println();
            System.out.println();
        }

        scanner.close();
    }
}
