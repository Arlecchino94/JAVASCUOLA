package edu.avogadro;

import javax.swing.*;

public class Esercizio173 {
    public static void main(String[] args) {
        //Leggere un vettore e cancellare i dati contigui ripetuti, compattando a sinistra; dare l'indice dell'ultimo elemento compattato
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza vettore"));
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
    }
}


