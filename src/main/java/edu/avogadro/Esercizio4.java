package edu.avogadro;

import javax.swing.*;

public class Esercizio4 {
    public static void main(String[] args) {
        //Trova minimo e massimo
        String output = "";
        int[][] matrice = new int[3][4];
        int min = matrice[0][0];
        int max = min;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire elemento N [" + i + "] [" + j + "]"));
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] > max) {
                    max = matrice[i][j];
                }
                if (matrice[i][j] < min) {
                    min = matrice[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, min + "\n" + max);
    }
}
