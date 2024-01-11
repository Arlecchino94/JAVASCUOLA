package edu.avogadro;

import javax.swing.*;

public class VerificaRecupero {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire quanti numeri verranno immessi");
        int n = Integer.parseInt(input);
        int min = 0;
        int max = 0;
        int cont = 1;
        while (cont <= n) {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
            if (cont == 1) {
                min = n1;
                max = n1;
            } else {
                if (n1 > max) {
                    max = n1;
                }
                if (n1 < min) {
                    min = n1;
                }
            }
            cont++;
        }
        JOptionPane.showMessageDialog(null, "Il numero minimo è: "+min+"\n"+"Il numero massimo è: "+max);
    }
}
