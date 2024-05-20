package edu.avogadro;

import javax.swing.*;

public class Esercizio256 {
    public static void main(String[] args) {
        /*
        Scambiare in modo simmetrico le diagonali principali di una matrice quadrata
        n = righe
        m = colonne
        ESEMPIO:
        00 01 02 03     03 01 02 00   (0,0)<->(0,3)
        04 05 06 07 --> 04 06 05 07   (1,1)<->(1,2)
        08 09 10 11     08 10 09 11   (2,2)<->(2,1)
        12 13 14 15     15 13 14 12   (3,3)<->(3,0)

        ANALISI:
        Basta fare un ciclo con r da 0 a m-1 e scambiare mat[r][r] <-> mat [r][n-1-r]
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire righe"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire colonne"));
        int[][] mat = new int[5][5];
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = cont;
                cont++;
            }
        }
        int k = 0;
        for (int r = 0; r < mat.length - 1; r++) {
                k = mat[r][r];
                mat[r][r] = mat[r][n - 1 - r];
                mat[r][n - 1 - r] = k;
        }
        String output = "";
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                output += mat[r][c] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
