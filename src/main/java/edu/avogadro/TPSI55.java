package edu.avogadro;

import javax.swing.*;

public class TPSI55 {

    public static void main(String[] args) {
        //5.Trovare i numeri pari in un array di numeri interi inseriti dall’utente e stamparli.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza Array"));
        int[] v = new int[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            }
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                output += v[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
