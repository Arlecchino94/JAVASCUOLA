package edu.avogadro;

import javax.swing.*;

public class Esercizio127 {
    // stampare i numeri negativi da -1 a N con un ciclo for a passo positivo
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = n; i <= -1 ; i++) {
            output += i + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
