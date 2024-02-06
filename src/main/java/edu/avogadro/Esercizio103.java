package edu.avogadro;

import javax.swing.*;

public class Esercizio103 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        for (int i = 1; somma <= n;i++) {
            somma = somma + i;
        }
        JOptionPane.showMessageDialog(null, somma);

    }
}
