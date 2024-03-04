package edu.avogadro;

import javax.swing.*;

public class Esercizio128 {
    // Stampare i numeri pari minori di un valore inserito
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 2; i < n ; i+=2) {
                output += " "+ i;

        }
        JOptionPane.showMessageDialog(null, output);

    }
}
