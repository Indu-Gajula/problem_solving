package org.example.assessment;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Chessgame {

  public static String  findCurrentPlace(String box, int rows, int columns){

        int row = Character.getNumericValue(box.charAt(0));
        char col = box.charAt(1);

        int currentRow = (row + rows - 1) % 8 + 1;
        char currentCol = (char) (((col - 'a') + columns) % 8 + 'a');

        return currentRow +""+ currentCol;
        
    }

    public static void splitOne(int number){
      int min = (int) Math.pow(10, number-1);
      int max = (int) Math.pow(10, number);
      String s = IntStream.range(min, max).boxed().
        filter(i -> isInAscendingOrder(i)).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(s);
    }
    static boolean isInAscendingOrder(int num){
      String n = String.valueOf(num);
      for(int i=0;i<n.length()-1;i++){
          if(n.charAt(i)>n.charAt(i+1)){
              return false;
          }
      }
      return true;
    }

    public static void main(String[] args) {
        splitOne(2);
    }


}
