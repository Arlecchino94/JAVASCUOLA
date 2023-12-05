package edu.avogadro;

import javax.swing.*;

public class Esercizio87 {
    public static void main(String[] args) {
        /* il quadrato di n si può calcolare come somma dei primi n numeri dispari.
        Calcolare il quadrato di n in questo modo:
        4^2 = 1+3+5+7
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numeri"));
        int somma = 0;
        for (int i = 1; i <= n; i++) {
            int disp = 2*i-1;
            somma += disp;
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}
