package ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Game game = new Game();
        while (game.isRunning()) {
            game.display();
            game.play(getInput());
        }
        game.display();
        if (game.winnerChecker() == null) {
            System.out.println("Game draw");
        } else {
            System.out.println(game.winnerChecker());
        }
    }


    public static Position getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row number where you want to put 'X' or '0'");
        int row = input.nextInt();
        System.out.println("enter the column number where you want to put 'X' or '0'");
        int column = input.nextInt();
        Position position = new Position(row, column);
        return position;
    }
}