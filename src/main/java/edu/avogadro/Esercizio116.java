package edu.avogadro;

import javax.swing.*;

public class Esercizio116 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int pot = 1;
        int somma = 0;
        for (int i = 0; i <=n ; i++) {
            somma+=pot;
            pot*=2;
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}
