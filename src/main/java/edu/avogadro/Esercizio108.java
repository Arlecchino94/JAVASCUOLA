package edu.avogadro;

import javax.swing.*;

public class Esercizio108 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire primo numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire secondo numero"));
        int somma = 0;
        int multipli = 5;
        int cont = 1;
        for (int i = n1;i <= n2;i++) {
            if (i % 5 == 0) {
                somma += i;
            }
        }
        JOptionPane.showMessageDialog(null, somma);

    }
}
