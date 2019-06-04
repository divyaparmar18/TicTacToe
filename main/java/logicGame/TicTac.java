package logicGame;

public class TicTac {
    public static void main(String[] args) {
        Board board1 = new Board();
        board1.displayGrid();
        board1.getBoardUpdated(1,1,"X");
        board1.displayGrid();
        System.out.println();
        board1.getBoardUpdated(0,2,"0");
        board1.displayGrid();
    }
}
