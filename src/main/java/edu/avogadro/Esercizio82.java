package edu.avogadro;

import javax.swing.*;

public class Esercizio82 {
    public static void main(String[] args) {
        //Calcolare la somma dei quadrati dei primi n numeri superiori ad m
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int n = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire un numero");
        int m = Integer.parseInt(input);
        int somma = 0;
        for (int i = 1; i <= n; i++) {
            m++;
            somma += m * m;
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}
