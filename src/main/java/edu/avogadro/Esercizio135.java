package edu.avogadro;

import javax.swing.*;

public class Esercizio135 {
    public static void main(String[] args) {
        // stampare un triangolo centrato
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    output += " ";
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    output += "*";
                }
                output += "\n";
            }
        JOptionPane.showMessageDialog(null, output);
        }
    }
