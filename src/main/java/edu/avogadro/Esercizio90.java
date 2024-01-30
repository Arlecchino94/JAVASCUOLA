package edu.avogadro;

import javax.swing.*;

public class Esercizio90 {
    public static void main(String[] args) {
        // Data la successione 1 2 4 8 16 32... in cui ogni elemento è il doppio del precedente, stabilire qual è il primo termine maggiore di un valore N introdotto
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int dopp = 1;
        while (dopp <= n) {
            dopp *= 2;
        }
        JOptionPane.showMessageDialog(null, "Il primo termine maggiore di " + n + " è: " + dopp);

    }
}
