package edu.avogadro;

import javax.swing.*;

public class Esercizio162 {
    public static void main(String[] args) {
        // date le temperature di una città per ogni giorno di un mese, calcolare la temperatura media e stampare i giorni
        // in cui la temperatura è stata superiore alla media
        int n = 31;
        int[] v = new int[n];
        int som = 0;
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            som += v[i];
        }
        int med = som / 31;
        for (int i = 0; i < n; i++) {
            if (v[i] > med) {
                output += i+" ";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
