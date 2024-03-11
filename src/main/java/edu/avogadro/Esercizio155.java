package edu.avogadro;

import javax.swing.*;

public class Esercizio155 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza vettore"));
        int[] vet = new int[n];
        int somma = 0;
        String output = "";
        for (int i = 0; i < n; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            }
        for (int i = 0; i < n-1; i++) {
            if (vet[i] % 2 == 0) {
                somma += vet[i];
            }
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}

