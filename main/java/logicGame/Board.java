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
        System.out.println("\n");
    }

    public void updateBoard(int row, int column, String symbol) {
        board[row][column] = symbol;
    }
}
