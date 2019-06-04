package logicGame;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Board board = new Board();
        Position position = new Position();
        board.displayGrid();
        int counter = 0;
        while (true) {
            position.getposition();
            board.updateBoard(position.row,position.column,"X");
            board.displayGrid();
            if(winnerChecker(board.board,"X")){
                System.out.println("Congratulations! Player X wins");
                break;
            }counter++;

            if(counter==9){
                System.out.println("game over");
                break;
            }
            position.getposition();
            board.updateBoard(position.row,position.column,"0");
            board.displayGrid();
            if(winnerChecker(board.board,"0")){
                System.out.println("Congratulations ! Player 0 wins");
                break;
            }counter++;
        }
    }


    public static String[][] getGrid() {
        String[][] board = new String[][]{
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };
        return board;
    }

    public static String[][] getBoard(String[][] board) {
        for (String[] innerArray : board) {
            for (String element : innerArray) {
                System.out.print(element + " | ");
            }
            System.out.print(("\n"));
            System.out.println("------------");
        }
        return board;

    }

    public static String[][] updateBoardForX(String[][] board) {
        int player1Row = getinput("enter the row you want to put X");
        int player1Column = getinput("enter the column you want to put X");
            board[player1Row][player1Column] = "X";
        return board;
    }


    public static String[][] updateBoardFor0(String[][] board) {
        int player1Row = getinput("enter the row you want to put X");
        int player1Column = getinput("enter the column you want to put X");
        board[player1Row][player1Column] = "0";
        return board;
    }

    public static int getinput(String msg) {
        Scanner obj = new Scanner(System.in);
        System.out.println(msg);
        int playerInput = obj.nextInt();
        return playerInput;
    }
    private static boolean winnerChecker(String[][] board, String playerInput) {
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