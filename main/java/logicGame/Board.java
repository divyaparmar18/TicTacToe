package logicGame;

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
    }

    public void getBoardUpdated(int row, int column, String symbol) {
        board[row][column] = symbol;
    }
}
