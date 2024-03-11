package edu.avogadro;

import javax.swing.*;

public class Esercizio154 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore"));
        int[] v = new int[n];
        String output = "";
        int start = 0;
        for (int i = 0; i < n-1; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        }
        int conf =  Integer.parseInt(JOptionPane.showInputDialog("Numero di confronto"));
        for (int i = 0; i <= n-1; i++) {
            if (v[i] > conf) {
                start = i;
                break;
            }
        }

        for (int i = start; i <= n-1; i++) {
            output += v[i]+" ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
