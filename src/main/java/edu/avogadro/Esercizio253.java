package edu.avogadro;

import javax.swing.*;

public class Esercizio253 {
    public static void main(String[] args) {
        //Visualizzare gli elementi di una matrice quadrata procedendo per diagonali principali
        /*
        diff = differenza
        Si effettua un ciclo da 0 a matrice.length-1
        (5,0) diff=5
        (4,0) (5,1) diff=4
        (3,0) (4,1) (5,2) diff=3
        (2,0) (3,1) (4,2) (5,3) diff=2
        (1,0) (2,1) (3,2) (4,3) (5,4) diff = 1
        (0,0) (1,1) (2,2) (3,3) (4,4) (5,5)diff = 0
        (0,1) (1,2) (2,3) (3,4) (4,5) diff = -1
        (0,2) (1,3) (2,4) (3,5) diff = -2
        (0,3) (1,4) (2,5) diff = -3
        (0,4) (1,5) diff = -4
        (0,5) diff = -5

         */
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int n = matrix.length;

        for (int diff = n - 1; diff >= -n + 1; diff--) {
            for (int i = Math.max(0, -diff); i < Math.min(n, n - diff); i++) {
                int j = i + diff;
                System.out.print("(" + i + "," + j + ") " + matrix[i][j] + " ");
            }
            System.out.println("diff = " + diff);
        }
    }
}