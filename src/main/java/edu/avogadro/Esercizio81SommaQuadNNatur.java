package edu.avogadro;

import javax.swing.*;

public class Esercizio81SommaQuadNNatur {
    public static void main(String[] args) {
        //scrivere la somma dei quadrati dei primi n numeri naturali
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int n = Integer.parseInt(input);
        int somma = 0;
        for (int cont = 1; cont <= n; cont++) {
            somma += cont*cont;
        }
        JOptionPane.showMessageDialog(null, "la somma è: " + somma);
    }
}
