package ticTacToe;

public class Game {
    private Board board = new Board();
    private Turn currentTurn = new Turn();
    private int count = 0;


    void display() {
        board.displayGrid();
    }

    void play(Position position) {
        count++;
        board.updateBoard(position, currentTurn.changeTurn());
    }

    String winnerChecker() {
        if (board.board[0][0].equals(currentTurn.getTurn()) && board.board[0][1].equals(currentTurn.getTurn()) && board.board[0][2].equals(currentTurn.getTurn())) {
            return "The winner is " + currentTurn.getTurn();
        } else if (board.board[1][0].equals(currentTurn.getTurn()) && board.board[1][1].equals(currentTurn.getTurn()) && board.board[1][2].equals(currentTurn.getTurn())) {
            return " The winner is " + currentTurn.getTurn();
        } else if (board.board[2][0].equals(currentTurn.getTurn()) && board.board[2][1].equals(currentTurn.getTurn()) && board.board[2][2].equals(currentTurn.getTurn())) {
            return currentTurn.getTurn();
        } else if (board.board[0][0].equals(currentTurn.getTurn()) && board.board[1][1].equals(currentTurn.getTurn()) && board.board[2][2].equals(currentTurn.getTurn())) {
            return "The winner is" + currentTurn.getTurn();
        } else if (board.board[0][2].equals(currentTurn.getTurn()) && board.board[1][1].equals(currentTurn.getTurn()) && board.board[2][0].equals(currentTurn.getTurn())) {
            return "The winner is " + currentTurn.getTurn();
        } else if (board.board[0][0].equals(currentTurn.getTurn()) && board.board[1][0].equals(currentTurn.getTurn()) && board.board[2][0].equals(currentTurn.getTurn())) {
            return "The winner is " + currentTurn.getTurn();
        } else if (board.board[0][1].equals(currentTurn.getTurn()) && board.board[1][1].equals(currentTurn.getTurn()) && board.board[2][1].equals(currentTurn.getTurn())) {
            return "The winner is " + currentTurn.getTurn();
        } else if (board.board[0][2].equals(currentTurn.getTurn()) && board.board[1][2].equals(currentTurn.getTurn()) && board.board[2][2].equals(currentTurn.getTurn())) {
            return "The winner is " + currentTurn.getTurn();
        }
        return null;
    }

    boolean isRunning() {
        if (count == 9) {
            return false;
        }
        return winnerChecker() == null;
    }
}