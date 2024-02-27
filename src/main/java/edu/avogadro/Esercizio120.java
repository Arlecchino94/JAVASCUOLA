package edu.avogadro;

import javax.swing.*;

public class Esercizio120 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int i = n ;
        boolean ciclo = true;
        int div = 0;
        while (ciclo) {
            div = 0;
            i++;
            if (i != 2 && i % 2 == 0) {
                i++;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == 2) {
                ciclo = false;
            }

        }JOptionPane.showMessageDialog(null, "il valore superiore a "+n+" è: "+i);
    }
}