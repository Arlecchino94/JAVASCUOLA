package edu.avogadro;

import javax.swing.*;

public class Esercizio159 {
    public static void main(String[] args) {
        //Mettere in scala dei dati sperimentali: i dati D1 D2 .. Dp vanno rapportati a cento.
        //ogni dato Dj diventa Dj x 100 / Dmax dove Dmax indica il dato di valore massimo
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza dell'array"));
        double[] v = new double[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un numero"));
        }
        double max = v[0];
        for (int i = 0; i < n; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        for (int i = 0; i < n; i++) {
            v[i] = (v[i] * 100)/max;
            output += v[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
