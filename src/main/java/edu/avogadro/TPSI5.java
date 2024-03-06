package edu.avogadro;

import javax.swing.*;
public class TPSI5 {
    public static void main(String[] args) {
        int lunghezza = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la lunghezza dell'array: "));
        int[] numeri = new int[lunghezza];

        for (int i = 0; i < lunghezza; i++) {
            numeri[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire i numeri"));
        }

        int massimo = numeri[0];
        for (int i = 1; i < lunghezza; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Il valore massimo nell'array è: " + massimo);
    }
}
