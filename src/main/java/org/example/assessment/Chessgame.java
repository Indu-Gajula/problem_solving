package org.example.assessment;

public class Chessgame {

  public static String  findCurrentPlace(String box, int rows, int columns){

        int row = Character.getNumericValue(box.charAt(0));
        char col = box.charAt(1);

        int currentRow = (row + rows - 1) % 8 + 1;
        char currentCol = (char) (((col - 'a') + columns) % 8 + 'a');

        return currentRow +""+ currentCol;
        
    }
}
