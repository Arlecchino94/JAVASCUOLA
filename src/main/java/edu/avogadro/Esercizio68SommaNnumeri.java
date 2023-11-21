package edu.avogadro;

import javax.swing.*;

public class Esercizio68SommaNnumeri {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        double somma = 0;
        while (!input.equals("")) {
            double n = Double.parseDouble(input);
            somma += n; //somma = somma + n;
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
        JOptionPane.showMessageDialog(null, "La somma è: "+somma);
    }
}
