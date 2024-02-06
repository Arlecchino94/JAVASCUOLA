package edu.avogadro;

import javax.swing.*;

public class Esercizio102 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        String output ="";
        for (int i = 1; i <= n;i++) {
            somma = somma + i;
            output = ""+somma;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
