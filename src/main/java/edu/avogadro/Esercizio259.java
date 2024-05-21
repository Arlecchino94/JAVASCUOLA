package edu.avogadro;

import javax.swing.*;

public class Esercizio259 {
    public static void main(String[] args) {
        //Realizzare la trasporta di una matrice quadrata usando una matrice ausiliaria
        //La trasporta
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire dimensione"));
        int[][] m = new int[n][n];
        int cont = 0;
        int[][] l = new int[n][n];
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
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                l[r][c] = m[c][r];
            }
        }
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                output += l[r][c] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
