package edu.avogadro;

import javax.swing.*;

public class Esercizio83 {
    public static void main(String[] args) {
        //Calcolare la somma di tutti i numeri dispari da uno a n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int somma = 0;
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 1) {
                somma += i;
            }
        }
        JOptionPane.showMessageDialog(null, "La somma è: " + somma);

    }
}
