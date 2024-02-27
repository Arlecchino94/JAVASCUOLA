package edu.avogadro;

import javax.swing.*;

public class Esercizio121 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri primi visualizzare"));
        boolean ciclo = true;
        int div;
        int i = n;
        int contPrimi = 0;
        String output = "";
        while (contPrimi < m) {
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
                    output += " "+i;
                    contPrimi++;
                    ciclo = false;
                }
            }
            ciclo = true;
        }
        JOptionPane.showMessageDialog(null, "i numeri sono: "+output);
    }
}