package edu.avogadro;

import javax.swing.*;

public class Esercizio133 {
    /* Stampare un triangolo di N righe del tipo:
    *
    * *
    * * *
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output += " * ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
