package edu.avogadro;

import javax.swing.*;

public class Esercizio258 {
    public static void main(String[] args) {
        //Shiftare verso il basso ogni colonna di una matrice
        //Si parte dalla riga in fondo e si copia l'elemento che sta sopra (i-1) al posto dell'elemento che sta "sotto" (i)

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
        for (int r = m.length -1; r > 0; r--) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = m[r-1][c];
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
