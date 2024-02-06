package edu.avogadro;

import javax.swing.*;

public class Esercizio106 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        int i = 1;
        for (;somma < n;i++) {
            somma = somma + i;

        }
        JOptionPane.showMessageDialog(null, i);

    }
}
