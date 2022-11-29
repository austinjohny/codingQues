// first tile is black second tile is white
// find the sum of white tiles
package com.austin.basics;

public class ChessWhiteSum {

    public static int findWhiteSum(int[][] mat){
        int sum = 0;
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if((i+j) % 2 == 0)
                    sum+=mat[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1,2,3,4},
                {12,13,14,15},
                {22,23,24,25},
                {32,33,34,35}
        };
        int res = findWhiteSum(mat);
        System.out.println(res);

    }
}
