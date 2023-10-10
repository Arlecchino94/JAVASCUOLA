package edu.avogadro;

import javax.swing.*;

public class Esercizio23positivonegativo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserisci primo valore");
        double n = Double.parseDouble(input);
        String output = "";
        if (n >= 0) {
            output = n + "è positivo";
        } else {
            output = n + "è negativo";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
