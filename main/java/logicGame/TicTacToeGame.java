package logicGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        String[][] updatedBoard = getGrid();
        int counter = 1;
        while (counter < 9) {
            List<Object> list = updateBoardForX(getBoard(updatedBoard));
            boolean flag = isValid(list);
            updatedBoard = (String[][]) list.get(1);
            if (!flag) {
                System.out.println(counter);
                counter--;
            } else {
                List<Object> list1 = updateBoardFor0(getBoard(updatedBoard));
                boolean flag1 = isValid(list1);
                updatedBoard = (String[][]) list.get(1);
                counter++;
                System.out.println(counter);
                if (!flag1) {
                    List<Object> list2 = updateBoardFor0(getBoard(updatedBoard));
                    boolean flag2 = isValid(list1);
                    updatedBoard = (String[][]) list.get(1);
                    counter++;

                } else {
                    System.out.println(counter);
                    counter++;
                    System.out.println(counter);

                }

            }
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

    public static List<Object> updateBoardForX(String[][] board) {
        int i = 0;
        List<Object> list = new ArrayList<>();
        boolean flag = true;
        int player1Row = getinput("enter the row you want to put X");
        int player1Column = getinput("enter the column you want to put X");
        if (player1Column > 2 || player1Row > 2) {
            System.out.println("invalid input");
            flag = false;
        } else if (board[player1Row][player1Column].equals("X") || board[player1Row][player1Column].equals("0")) {
            System.out.println("position already acquired");
            flag = false;
        } else {
            board[player1Row][player1Column] = "X";
        }
        list.add(flag);
        list.add(board);
        return list;
    }


    public static List<Object> updateBoardFor0(String[][] board) {
        List<Object> list = new ArrayList<>();
        boolean flag = true;
        int player1Row = getinput("enter the row you want to put 0");
        int player1Column = getinput("enter the column you want to put 0");
        if (player1Column > 2 || player1Row > 2) {
            System.out.println("invalid input");
            flag = false;
        } else if (board[player1Row][player1Column].equals("X") || board[player1Row][player1Column].equals("0")) {
            System.out.println("position already acquired");
            flag = false;
        } else {
            board[player1Row][player1Column] = "0";
        }
        list.add(flag);
        list.add(board);
        return list;
    }

    public static boolean isValid(List<Object> list) {
        boolean flag = (boolean) list.get(0);
        if (flag) {
            return true;
        } else {
            return false;
        }
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