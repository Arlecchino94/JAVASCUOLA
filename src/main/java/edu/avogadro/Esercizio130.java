package edu.avogadro;

import javax.swing.*;

public class Esercizio130 {
    public static void main(String[] args) {
        // stampare i numeri dispari in ordine decrescente da un valore N inserito a 1
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 0; n >= i ; n--) {
            if (n % 2 == 1) {
                output += " "+n;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
