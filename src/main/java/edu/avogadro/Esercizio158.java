package edu.avogadro;

import javax.swing.*;

public class Esercizio158 {
    public static void main(String[] args) {
        //Inserire dei dati in un vettore e calcolare di ciascuno la percentuale
        //di incidenza sul totale (memorizzandola nel corrispondente elemento di un secondo vettore)
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore"));
        double[] v = new double[n];
        double[] v2 = new double[n];
        double somma = 0;
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un numero"));
            somma += v[i];
        }
        for (int i = 0; i < n; i++) {
            v2[i] = (v[i] / somma) * 100;
            output += String.format("La percentuale di incidenza è: %5.2f \n", v2[i]);

        }
        JOptionPane.showMessageDialog(null, output);

    }
}
