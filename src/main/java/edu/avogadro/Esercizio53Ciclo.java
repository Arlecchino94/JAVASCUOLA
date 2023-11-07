package edu.avogadro;

import javax.swing.*;

public class Esercizio53Ciclo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        while (!input.equals("")) {
            double n = Double.parseDouble(input);
            double quadrato = n*n;
            double cubo = n*n*n;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Il quadrato di %f è %f mentre il cubo di %f è %f",
                            n, quadrato, n, cubo));
                    input = JOptionPane.showInputDialog("Inserisci un numero");
        }
    }
}
