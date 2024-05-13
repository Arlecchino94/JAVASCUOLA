package edu.avogadro;

import javax.swing.*;

public class Matrice1 {

    public static void main(String[] args) {
        String output = "";
        int [] [] matrice = new int[10][10];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = i*j;
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                output += matrice[i][j] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
