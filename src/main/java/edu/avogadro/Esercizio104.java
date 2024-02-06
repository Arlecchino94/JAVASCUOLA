package edu.avogadro;

import javax.swing.*;

public class Esercizio104 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        int prec = 1;
        for (int i = 1; somma <= n;i++) {
            prec = somma;
            somma = somma + i;
        }
        JOptionPane.showMessageDialog(null, prec);

    }
}

