package edu.avogadro;

import javax.swing.*;

public class Esercizio31NumeriOrdineCrescente {
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
        if (c < min) {
            JOptionPane.showMessageDialog(null, c + " " + min + " " + max);
        }else if (c < max) {
            JOptionPane.showMessageDialog(null, min + " " + c + " " + max );
        } else {
            JOptionPane.showMessageDialog(null, min + " " + max + " " + c );
        }
    }
}
