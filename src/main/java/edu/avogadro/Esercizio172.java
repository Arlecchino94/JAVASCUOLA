package edu.avogadro;

import javax.swing.*;

public class Esercizio172 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci lunghezza array"));
        int[] v = new int[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        }
        int q = Integer.parseInt(JOptionPane.showInputDialog("Inserisci distanza"));
        for (int z = 1; z < q; z++) {
            int salva = v[0];
            for (int i = 0; i < n - 2; i++) {
                int salva1 = v[i + 1];
                v[i + 1] = salva;
                salva = salva1;
            }
            v[0] = 0;
        }
        for (int i = 0; i < n; i++) {
            output += v[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}