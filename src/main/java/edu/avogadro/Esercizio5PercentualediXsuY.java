package edu.avogadro;

import javax.swing.*;

public class Esercizio5PercentualediXsuY {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("inserire il valore X");
        double X = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire il valore Y ");
        double Y = Double.parseDouble(input);
        double perc = X/Y*100;
        JOptionPane.showMessageDialog(null, X+" è il "+perc+"% di "+Y);
    }
}
