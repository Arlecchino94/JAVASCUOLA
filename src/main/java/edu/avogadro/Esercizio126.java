package edu.avogadro;

import javax.swing.*;

public class Esercizio126 {
    public static void main(String[] args) {
        // stampare i numeri negativi da -1 a N con un ciclo for a passo negativo
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = -1; i >= n ; i--) {
            output += i + ",";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
