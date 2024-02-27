package edu.avogadro;

import javax.swing.*;

public class Esercizio118 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int pot = x^m;
        for (int i = 0; m <= n ; i++) {
            JOptionPane.showMessageDialog(null, pot);
            pot = pot * x;
        }
    }
}
