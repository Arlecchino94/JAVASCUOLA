package edu.avogadro;

import javax.swing.*;

public class Esercizio34QuattroNumSommaMax {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int max,max1;
        if (a < b) {
            max = b;
            max1 = a;
        } else {
            max = a;
            max1 = b;
        }
        if (c > max) {
            max1 = max;
            max = c;
        } else if (c > max1) {
            max1 = c;
        }
        if (d > max) {
            max1 = max;
            max = d;
        }
        int tot = max1 + max;

        JOptionPane.showMessageDialog(null, "La somma dei numeri maggiori è: " +tot);
    }
}
