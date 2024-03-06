package edu.avogadro;

import javax.swing.*;

public class TPSI4 {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));

        int somma = 0;
        for (int i = 2; i < N; i++) {
            boolean isPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                somma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "La somma dei numeri primi inferiori a " + N + " è: " + somma);
    }
}
