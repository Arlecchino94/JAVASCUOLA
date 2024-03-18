package edu.avogadro;

import javax.swing.*;

public class Esercizio165 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserire lunghezza vettore"));
        int[] v = new int[n];
        int somma = 0;
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            if (i % 2 == 0){
                somma += v[i];
            }
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}
