package edu.avogadro;

import javax.swing.*;

public class Esercizio177 {
    public static void main(String[] args) {
        //Dato un vettore, copiare gli elementi di indice pari in un nuovo vettore
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
        int[] p = new int[(n+1)/2];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                p[i/2] = v[i];
            }
        }
        for (int i = 0; i < p.length; i++) {
            output += p[i];
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
