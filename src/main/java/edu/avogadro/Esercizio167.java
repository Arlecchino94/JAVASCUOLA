package edu.avogadro;

import javax.swing.*;

public class Esercizio167 {
    public static void main(String[] args) {
        //Scambiare le componenti di un vettore in modo simmetrico
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore"));
        int[] v = new int[n];
        int k;
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire un numero"));
        }
        for (int i = 0; i < n / 2; i++) {
            k = v[n-1-i];
            v[n-1-i] = v[i];
            v[i] = k;
        }
        for (int i = 0; i < n ; i++) {
            output += v[i];
        }
        JOptionPane.showMessageDialog(null, output);
    }
    public static void calcolo ()
}
