package edu.avogadro;

import javax.swing.*;

public class Esercizio65OrdinataCrescenteCiclo {
    public static void main(String[] args) {
        //verificare una serie di valori è ordinata in modo crescente
        String input = JOptionPane.showInputDialog("Inserire un numero");
        boolean ordinata = true;
        if (!input.equals("")) {
            double prec = Double.parseDouble(input);
            input = JOptionPane.showInputDialog("Inserire un numero");
            while (!input.equals("")) {
                double n = Double.parseDouble(input);
                if (n < prec) {
                    ordinata = false;
                }
                prec = n;
                input = JOptionPane.showInputDialog("Inserire un numero");
            }
        }
        if (ordinata) {
            JOptionPane.showMessageDialog(null, "Ordinata");
        } else {
            JOptionPane.showMessageDialog(null, "non ordinata");
        }
    }
}