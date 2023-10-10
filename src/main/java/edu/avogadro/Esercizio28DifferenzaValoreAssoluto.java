package edu.avogadro;

import javax.swing.*;

public class Esercizio28DifferenzaValoreAssoluto {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore"));
        double diff = a-b;
        if (diff < 0) {
            diff = -diff;
        }
            JOptionPane.showMessageDialog(null, "La differenza è: "+ diff);

    }
}
