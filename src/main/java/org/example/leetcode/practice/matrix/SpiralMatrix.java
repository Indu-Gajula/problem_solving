package org.example.leetcode.practice.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int leftCol = 0; int rightCol = matrix[0].length-1;
        int topRow = 0; int bottomRow = matrix.length-1;
        int len = matrix.length;

        while(topRow <= bottomRow && leftCol <= rightCol){

            for(int j = leftCol; j<=rightCol;j++ ){
                result.add(matrix[topRow][j]);
            }

            topRow++;
            for(int j = topRow;j<=bottomRow; j++){
                result.add(matrix[j][rightCol]);
            }
            rightCol--;

            if(topRow <= bottomRow){
                for(int j = rightCol; j>=leftCol ; j-- ){
                    result.add(matrix[bottomRow][j]);
                }
                bottomRow--;
            }
            if(leftCol <= rightCol){
                for(int j = bottomRow; j>=topRow; j--){
                    result.add(matrix[j][leftCol]);
                }
                leftCol++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
