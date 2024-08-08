package org.example.goldmansachs;

//931 - medium
public class MinimumFallingPathSum {

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;

        for(int i=1; i<n;i++){
            for(int j=0; j<n; j++){
                int a = Integer.MAX_VALUE;
                if(j!=0){
                    a = matrix[i-1][j-1];
                }
                int b = Math.min(a,matrix[i-1][j]);
                int c = Integer.MAX_VALUE;
                if(j != n-1){
                    c = matrix[i-1][j+1];
                }
                matrix[i][j] += Math.min(b,c);

            }
        }
        int ans = Integer.MAX_VALUE;

        for(int j=0; j<n; j++){
            ans = Math.min(ans,matrix[n-1][j]);
        }

        return ans;


    }

    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}})); //13
    }
}
