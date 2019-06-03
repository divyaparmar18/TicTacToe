package logicGame;

public class TicTacToeGame {
    public static void main(String[] args) {
       getGrid();
    }


    public static String[][] getGrid() {
        String[][] board = new String[][]{
                {".",".","."},
                {".",".","."},
                {".",".","."}
        };
        return board;
    }



}