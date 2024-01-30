package edu.avogadro;

import javax.swing.*;

public class Esercizio95 {
    public static void main(String[] args) {
        //Calcolare la somma delle cifre di un numero
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int k = n;
        int somma = 0;
        while (k > 0) {
            int cifra = k % 10;
            k = k / 10;
            somma += cifra;
        }
        JOptionPane.showMessageDialog(null, somma);



    }
}
