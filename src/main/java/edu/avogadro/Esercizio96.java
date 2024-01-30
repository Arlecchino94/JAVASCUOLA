package edu.avogadro;

import javax.swing.*;

public class Esercizio96 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int mcd = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        JOptionPane.showMessageDialog(null, a);
    }
}