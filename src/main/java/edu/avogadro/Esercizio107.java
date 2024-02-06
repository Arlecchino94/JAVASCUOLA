package edu.avogadro;

import javax.swing.*;

public class Esercizio107 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int prodotto = 1;
        int prec = 1;
        for (int i = 1; prodotto <= n; i++) {
            prec = prodotto;
            prodotto = prodotto * i;
        }
        JOptionPane.showMessageDialog(null, prec);
    }
}
