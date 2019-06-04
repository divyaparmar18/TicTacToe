package logicGame;

import java.util.Scanner;

public class Position {
    int row;
    int column;
    Scanner input = new Scanner(System.in);

   void getposition(){
       System.out.println("enter the row number where you want to put 'X' or '0'");
        this.row = input.nextInt();
       System.out.println("enter the column number where you want to put 'X' or '0'");
        this.column = input.nextInt();
    }

}
