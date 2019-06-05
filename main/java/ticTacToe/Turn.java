package ticTacToe;

public class Turn {

    private int counter;
    private String symbol;

    String changeTurn() {

        if (counter % 2 == 0) {
            symbol = "X";
        } else {
            symbol = "0";
        }
        counter++;
        return symbol;
    }

    String getTurn() {
        return symbol;
    }
}
