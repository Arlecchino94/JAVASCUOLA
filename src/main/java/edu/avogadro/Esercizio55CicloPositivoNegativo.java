package edu.avogadro;

import javax.swing.*;

public class Esercizio55CicloPositivoNegativo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        while (!input.equals("")) {
            double n = Double.parseDouble(input);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Il numero è positivo");
            }else {
                JOptionPane.showMessageDialog(null, "Il numero è negativo");
            }
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
    }
}
