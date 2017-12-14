package com.company;

import java.util.Random;

/**
 * Created by Andrea on 2017.12.14..
 */
public class MatrixOperation implements IMatrixOperation {
    public void printMatrix(int[][] matrix) {
//elöszõr megnézem a kapott paraméter nem e null, majd két forral végigmegyek a mátrixon és kiiratom a
        // mátrix elemeit, hozzáfûzve egy szóközzel, hogy átlátható legyen
        //majd új sor esetén használok egy sortörést.
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
           /*A megadott mátrix paramétereknek megfelelõen létrehozom a mátrixot,
         majd feltöltöm a megadott min és max közötti random számokkal.*/
        Random random = new Random();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }
}


