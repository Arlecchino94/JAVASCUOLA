package edu.avogadro;

import javax.swing.*;

public class Esercizio100 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        for (int i = 0; somma < n; i++) {
            somma = somma + i;
        }
        if (somma > n) {
            JOptionPane.showMessageDialog(null, "Il numero non è triangolare");
        }else {
            JOptionPane.showMessageDialog(null, "Il numero è triangolare");
        }

    }
}

