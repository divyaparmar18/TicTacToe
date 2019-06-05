package ticTacToe;

public class Game {
    Board board = new Board();
    Turn currentTurn = new Turn();
    TicTacToeGame ti = new TicTacToeGame();

    void display(){
        board.displayGrid();
    }


    boolean winnerChecker(String[][] board, String playerInput) {
        if (board[0][0].equals(playerInput) && board[0][1].equals(playerInput) && board[0][2].equals(playerInput)) {
            return true;
        } else if (board[1][0].equals(playerInput) && board[1][1].equals(playerInput) && board[1][2].equals(playerInput)) {
            return true;
        } else if (board[2][0].equals(playerInput) && board[2][1].equals(playerInput) && board[2][2].equals(playerInput)) {
            return true;
        } else if (board[0][0].equals(playerInput) && board[1][1].equals(playerInput) && board[2][2].equals(playerInput)) {
            return true;
        } else if (board[0][2].equals(playerInput) && board[1][1].equals(playerInput) && board[2][0].equals(playerInput)) {
            return true;
        } else if (board[0][0].equals(playerInput) && board[1][0].equals(playerInput) && board[2][0].equals(playerInput)) {
            return true;
        } else if (board[0][1].equals(playerInput) && board[1][1].equals(playerInput) && board[2][1].equals(playerInput)) {
            return true;
        } else if (board[0][2].equals(playerInput) && board[1][2].equals(playerInput) && board[2][2].equals(playerInput)) {
            return true;
        }
        return false;
    }




}