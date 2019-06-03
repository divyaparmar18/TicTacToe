package logicGame;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        getBoard(getGrid());
    }


    public static String[][] getGrid() {
        String[][] board = new String[][]{
                {".",".","."},
                {".",".","."},
                {".",".","."}
        };
        return board;
    }

    public static String [][] getBoard(String [][] board){
        for (String[] innerArray : board) {
            for (String element : innerArray) {
                System.out.print(element +" | ");
            }
            System.out.print(("\n"));
            System.out.println("------------");
        }
        return board;

    }

    public static String getinput(String msg) {
        Scanner obj = new Scanner(System.in);
        System.out.println(msg);
        String playerInput = obj.nextLine();
        return playerInput;
    }
}