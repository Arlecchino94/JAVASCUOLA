package edu.avogadro;

import javax.swing.*;

public class Esercizio255 {
    // Scambiare in modo simmetrico le colonne di una matrice
    /* ESEMPIO:
    01 02 03 04 --> 04 03 02 01
    05 06 07 08 --> 08 07 06 05
    09 10 11 12 --> 12 11 10 09

    Data la matrice mat[m][n] colonne,
    Basta scambiare gli elementi della prima colonna con quelli della seconda colonna e gli elementi
    della colonna 2 con quelli della colonna n-2. in generale m[r][c] <-> m[r][n-1-c] con c che va da 0 a n/2 dove n è il numero di colonne
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire righe"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire colonne"));
        int[][] mat = new int[n][m];
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = cont;
                cont++;
            }
        }
        int k = 0;
        for (int r = 0; r < mat.length - 1; r++) {
            for (int c = 0; c < mat[r].length / 2; c++) {
                k = mat[r][c];
                mat[r][c] = mat[r][n - 1 - c];
                mat[r][n - 1 - c] = k;
            }
        }
        String output = "";
        for (int r = 0; r < mat.length - 1; r++) {
            for (int c = 0; c < mat[r].length - 1; c++) {
                output += mat[r][c] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
