package edu.avogadro;

import javax.swing.*;

public class Esercizio257 {
    public static void main(String[] args) {
        //Shiftare a sinistra ogni riga di ogni matrice
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza matrice"));
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

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length -1 ; c++) {
                m[r][c] = m[r][c+1];
            }
            m[r][n-1] = 0;
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
