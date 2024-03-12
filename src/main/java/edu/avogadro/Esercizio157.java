package edu.avogadro;

import javax.swing.*;

public class Esercizio157 {
    public static void main(String[] args) {
        //Dati due vettori costruire un terzo vettore in cui ogni componente sia il minimo del corrispondente dei due vettori dati
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettori"));
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        int[] v3 = new  int[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero nel vettore 1"));
        }

        for (int j = 0; j < n; j++) {
            v2[j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero nel vettore 2"));
        }

        for (int i = 0; i < n; i++) {
            if (v1[i] < v2[i]){
                v3[i] = v1[i];
            }else {
                v3[i] = v2[i];
            }
            output += v3[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
