package ticTacToe;

public class Board {
    public String[][] board;

    public Board() {
        this.board = new String[][]{
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };
    }

    public void displayGrid() {
        for (String[] innerArray : board) {
            for (String element : innerArray) {
                System.out.print(element + " | ");
            }
            System.out.print(("\n"));
            System.out.println("------------");
        }
        System.out.println("\n");
    }

    public void updateBoard(Position position, String symbol) {
        board[position.row][position.column] = symbol;
    }
}
