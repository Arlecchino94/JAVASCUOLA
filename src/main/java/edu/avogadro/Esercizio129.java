package edu.avogadro;

import javax.swing.*;

public class Esercizio129 {
    public static void main(String[] args) {
        // stampare i numeri pari minori di un valore inserito con ciclo for a passo unitario
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 0; i <= n ; i++) {

            if (i %  2 == 0){
                output += " "+ i;
            }
        }
        JOptionPane.showMessageDialog(null, output);

    }
}