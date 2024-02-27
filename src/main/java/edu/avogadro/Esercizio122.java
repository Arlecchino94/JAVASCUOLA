package edu.avogadro;

import javax.swing.*;

public class Esercizio122 {
    public static void main(String[] args) {
        //dato un valore N, Calcolare la differenza tra la somma di numeri pari e dei numeri dispari inferiori.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int sommaPari = 0;
        int sommaDispari = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sommaPari += i;
            } else {
                sommaDispari += i;
            }
        }
        int diff = sommaPari - sommaDispari;
        JOptionPane.showMessageDialog(null, "La differenza è: "+diff);




    }
}
