package edu.avogadro;

import javax.swing.*;

public class Esercizio5Percentuale {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("inserire la percentuale");
        double X = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire il Numero ");
        double N = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "La percentuale è: "+(N*X)/100);
    }
}
