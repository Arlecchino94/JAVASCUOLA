package edu.avogadro;

import javax.swing.*;

public class Esercizio166 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire vettore"));
        int[] v = new int[n];
        int[] s = new int[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            s[n - 1 - i] = v[i];
        }
        for (int i = 0; i < n; i++) {
            output += v[i] + " ";
        }
        output += "\n";
        for (int i = 0; i < n; i++) {
            output += s[i] +" ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
