package edu.avogadro;

import javax.swing.*;

public class Esercizio161 {
    public static void main(String[] args) {
        // Dati un vettore e due valori di confronto, scrivere gli indici di tutti gli elementi compresi tra i due valori
        int n =  Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza vettore"));
        int[] v = new int[n];
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire secondo valore"));
        int min = 0;
        int max = 0;
        String output = "";

        if (a > b){
            max = a;
            min = b;
        }else {
            min = a;
            max = b;
        }

        for (int i = 0; i < n ; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            if ( v[i] <= max && v[i] >= min) {
                output += v[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
