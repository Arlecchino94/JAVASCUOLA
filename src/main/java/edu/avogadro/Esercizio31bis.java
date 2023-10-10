package edu.avogadro;

import javax.swing.*;

public class Esercizio31bis {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il terzo valore"));
        int min,max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        double med;
        if (c < min) {
            med = min;
            min = c;
        }else if (c < max) {
            med = c;
        } else {
            med = max;
            max = c;
        }
        JOptionPane.showMessageDialog(null, min + " " + med + " " + max);
    }
}