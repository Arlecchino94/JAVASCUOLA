package edu.avogadro;

import javax.swing.*;

public class Esercizi179 {
    public static void main(String[] args) {
        //Dato un vettore di N numeri inferiore a 1000, contare le frequenze con le quali i numeri si ripartiscono nelle decadi 0-9, 10-19,
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza"));
        int[] v = new int[n];
        int[] d = new int[100];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire nuemro"));
            d[v[i]/10]++;
        }
        for (int i = 0; i < 99; i++) {
            output += d[i] +" ";
        }
        System.out.println(output);

    }
}
