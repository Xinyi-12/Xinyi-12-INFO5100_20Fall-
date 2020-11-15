package ttt.java;

import java.util.Scanner;

public class testTTT {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        TTT game = new TTT();
        game.restoreBoard();
        System.out.println("Tic-Tac-Toe GAME !");
        do
        {
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do
            {
                System.out.println("Player " + game.getMarks() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeMark(row, col));
            game.changeMarker();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            game.printBoard();
            game.changeMarker();
            System.out.println(Character.toUpperCase(game.getMarks()) + " Congratulations you won!");
        }
    }
}
