package edu.avogadro;

import javax.swing.*;

public class Esercizio163 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("domande da fare"));
        int[] g = new int[n];
        int[] d = new int[n];
        int cont = 0;
        String output = "";

        for (int i = 0; i < n; i++) {
            g[i] = Integer.parseInt(JOptionPane.showInputDialog("valore risposta giusta"));
            d[i] = Integer.parseInt(JOptionPane.showInputDialog("valore da 1 a 4 risposta"));
            if (g[i] == d[i]) {
                cont++;
            }
        }
        output += cont;
        JOptionPane.showMessageDialog(null, output);
    }
}
