package edu.avogadro;

import javax.swing.*;

public class Esercizio117 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int pot = 2^m;
        int som = 0;
        for (int i = 0; m <= n ; i++) {
            som = som + pot;
            pot = pot * 2;
        }
        JOptionPane.showMessageDialog(null, som);
    }
}
