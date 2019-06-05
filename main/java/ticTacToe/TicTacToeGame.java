package ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Turn turn = new Turn();
        Board board = new Board();
        board.displayGrid();
        int counter = 0;
        while (true) {
            Game game = new Game();
            Position position = getInput();
            board.updateBoard(position, turn.changeTurn());
            board.displayGrid();
            if (game.winnerChecker(board.board, turn.getTurn())) {
                System.out.println("Congratulations! Player " + turn.getTurn() + " wins");
                break;
            }
            counter++;

            if (counter == 9) {
                System.out.println("game over");
                break;
            }
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