package edu.avogadro;

import javax.swing.*;

public class Esercizio113 {
    public static void main(String[] args) {
        //Dati due numeri verificare se sono primi fra di loro (non hanno divisori comuni)
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero"));
        String output = "Sono numeri primi";
        for (int i = 2; i <= n ; i++) {
            if (n % i == 0) {
                if (m % i == 0) {
                    output = "Non sono numeri primi";
                }
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
