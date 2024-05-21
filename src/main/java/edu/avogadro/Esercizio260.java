package edu.avogadro;

import javax.swing.*;

public class Esercizio260 {
    public static void main(String[] args) {
        //Reallizzare la trasporta di una matrice quadrata senza una matrice ausiliaria
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire grandezza matrice"));
        int[][] m = new int[n][n];
        int cont = 0;
        String output = "";
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = cont;
                cont++;
            }
        }
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                output += m[r][c] + " ";
            }
            output += "\n";
        }
        int k = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = r; c < m[r].length; c++) {
                k = m[r][c];
                m[r][c] = m[c][r];
                m[c][r] = k;
            }
        }
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                output += m[r][c] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
