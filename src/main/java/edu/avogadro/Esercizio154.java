package edu.avogadro;

import javax.swing.*;

public class Esercizio154 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore"));
        int[] vetord = new int[n];
        int num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero da confrontare"));
        String output = "";
        for (int i = 0; i < n; i++) {
            vetord[i] = i+1;
            if (vetord[i]>num) {
                output+= vetord[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, output);


    }
}
