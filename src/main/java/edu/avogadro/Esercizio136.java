package edu.avogadro;

import javax.swing.*;

public class Esercizio136 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";

        for (int i = 1; i <= n; i++) {
            for (int m = n; m > i ; m--) {
                output += ".";
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                output += "*";
            }
            for (int m = n; m > i ; m--) {
                output += ".";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

