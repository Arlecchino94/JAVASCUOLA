package edu.avogadro;

import javax.swing.*;

public class Esercizio131 {
    public static void main(String[] args) {
        /* stampare i numeri dispari in ordine decrescente
        da un valore N inserito a 1 utilizzando un ciclo for con passo unitario e positivo
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 1; i <= n ; i++) {
            int k = n -i +1;
            if (k % 2 == 1) {
                output += " "+k;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

