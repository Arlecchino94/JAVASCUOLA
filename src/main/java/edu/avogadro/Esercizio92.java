package edu.avogadro;

import javax.swing.*;

public class Esercizio92 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int a = 0;
        int b = 1;
        for (int i = 1; a < n;i++) {
            int c = a + b;
            JOptionPane.showMessageDialog(null, "I numeri sono: " + c);

            a = b;
            b = c;

        }
    }
}