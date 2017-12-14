package com.company;

import java.util.Random;

/**
 * Created by Andrea on 2017.12.14..
 */
public class MatrixOperation implements IMatrixOperation {
    public void printMatrix(int[][] matrix) {
//el�sz�r megn�zem a kapott param�ter nem e null, majd k�t forral v�gigmegyek a m�trixon �s kiiratom a
        // m�trix elemeit, hozz�f�zve egy sz�k�zzel, hogy �tl�that� legyen
        //majd �j sor eset�n haszn�lok egy sort�r�st.
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
           /*A megadott m�trix param�tereknek megfelel�en l�trehozom a m�trixot,
         majd felt�lt�m a megadott min �s max k�z�tti random sz�mokkal.*/
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


