package edu.avogadro;

import javax.swing.*;

public class Esercizio111 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero per trovare i multipli"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'ultimo numero massimo"));
        int multipli = 0;
        String output = "";
        for (int i = 0;i <= m/n;i++){
            multipli = n * i;
            output += (output.equals("")?"":",")+multipli;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}