package edu.avogadro;

import javax.swing.*;

public class TPSI1 {

    public static void main(String[] args) {
        int limiteInferiore = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite 1"));
        int limiteSuperiore = Integer.parseInt(JOptionPane.showInputDialog("Inserire limite 2"));
        String output = "";

        for (int numero = limiteInferiore; numero <= limiteSuperiore; numero++) {
            int cifre = String.valueOf(numero).length();
            int somma = 0;
            int temp = numero;

            while (temp != 0) {
                int cifra = temp % 10;
                somma += Math.pow(cifra, cifre);
                temp /= 10;
            }

            if (somma == numero) {
                output += numero;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
