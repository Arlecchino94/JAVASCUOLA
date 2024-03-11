package edu.avogadro;

import javax.swing.*;

public class Esercizio157 {
    public static void main(String[] args) {
        //Dati due vettori costruire un terzo vettore in cui ogni componente sia il minimo del corrispondente dei due vettori dati
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore 1"));
        int[] v1 = new int[n1];
        int[] v2 = new int[n1];
        int[] v3 = new  int[n1];
        String output = "";
        for (int i = 0; i < n1; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        }
        for (int j = 0; j < n1; j++) {
            v2[j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        }
        for (int i = 0; i < n1; i++) {
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
