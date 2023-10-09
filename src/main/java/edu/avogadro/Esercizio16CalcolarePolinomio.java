package edu.avogadro;

import javax.swing.*;

public class Esercizio16CalcolarePolinomio {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire il valore di X");
        double x = Integer.parseInt(input);
        double y = Math.pow(x, 2)*3 + (5*x)-6;
        JOptionPane.showMessageDialog(null, "il valore di Y è: "+y);

    }
}
