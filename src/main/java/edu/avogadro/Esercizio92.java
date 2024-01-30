package edu.avogadro;

import javax.swing.*;

public class Esercizio92 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int a = 0;
        int b = 1;
        int c;
        if (n > a) {
            JOptionPane.showMessageDialog(null, a);
            while (n > b) {
                JOptionPane.showMessageDialog(null, b);
                c = b;
                b = a + b;
                a = c;
            }

        }
    }
}