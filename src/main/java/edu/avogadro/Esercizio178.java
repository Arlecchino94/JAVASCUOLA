package edu.avogadro;

import javax.swing.*;

public class Esercizio178 {
    public static void main(String[] args) {
        //Dato un vettore, calcolare la media e costruire due vettori uno con gli elementi minori e uno con gli elementi maggiori della media
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        double somma = 0.0;
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
            somma += v[i];
        }
        double media = somma / n;
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] < media) {
                min++;
        }else if (v[i] > media){
                max++;
            }
        }
        double[] m = new double[min];
        double[] g = new double[max];
        min = 0;
        max = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] < media) {
                m[min] = v[i];
                min++;
            }else if (v[i] > media){
                g[max] = v[i];
                max++;
            }
        }
        for (int i = 0; i < m.length; i++) {
            output += m[i] + " ";
        }
        output += "\n";
        for (int i = 0; i < g.length; i++) {
            output += g[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
