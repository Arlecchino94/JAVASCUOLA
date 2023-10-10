package edu.avogadro;

import javax.swing.*;

public class Esercizio26NumeroMinore {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserisci un valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore"));
        double min =0.0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        String output = "Il numero minore tra "+a+" e "+b+" è: "+min;
        JOptionPane.showMessageDialog(null, output);
    }
}
