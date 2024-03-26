package edu.avogadro;

import javax.swing.*;

public class Esercizio175 {
    public static void main(String[] args) {
        //Letto V, caricare i suoi divisori in un vettore
        String output = "";
        int v = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int div = 0;
        for (int i = 1; i < v; i++) {
            if (v % i == 0) {
                div++;
            }
        }
        int[] d = new int[div];
        div = 0;
        for (int i = 1; i < v; i++) {
            if (v % i == 0) {
                d[div] = i;
                div++;
            }
        }
        for (int i = 1; i <= div - 1; i++) {
            output += d[i];
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
