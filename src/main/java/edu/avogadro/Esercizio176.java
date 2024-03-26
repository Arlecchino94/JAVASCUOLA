package edu.avogadro;

import javax.swing.*;

public class Esercizio176 {
    public static void main(String[] args) {
        //Dato un vettore copiare i valori pari in un nuovo vettore
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
        int pari = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0){
                pari++;
            }
        }
        int[] p = new int[pari];
        pari = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                p[pari] = v[i];
                pari++;
            }
        }
        for (int i = 0; i < p.length;i++){
            output += p[i];
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
