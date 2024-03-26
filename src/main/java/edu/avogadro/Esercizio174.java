package edu.avogadro;

import javax.swing.*;

public class Esercizio174 {
    public static void main(String[] args) {
        //Dato un valore e un numero N caricare i suoi primi N multipli in un vettore
        //Inserimento numeri
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int f = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        //lunghezza array
        int v = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        // creazine dell' array con la stessa lunghezza
        int[] m = new int[v];
        for (int i = 0; i < n-1; i++) {
            m[i] = v*(i+1);
        }
        for (int i = 0; i < n-f; i++) {
            output += m[i];
        }
        JOptionPane.showMessageDialog(null, output);
        //Letto un valore v e un numero n, innanzitutto creiamo un vettore M di N elementi e poi calcoliamo i multipli partendo da 1 in modo che in m[i] = v*(i+1)


    }
}
