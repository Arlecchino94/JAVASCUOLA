package edu.avogadro;

import javax.swing.*;

public class Esercizio74Fattoriali {
    public static void main(String[] args) {
        //Calcolare il fattoriale di un numero
        String input = JOptionPane.showInputDialog("Inserire un numero");
        long n = Long.parseLong(input);
        long fattoriale = 1;
        for (int i = 1;i <= n; i++) {
            fattoriale *= i;
        }
        JOptionPane.showMessageDialog(null, "Il risultato è: "+fattoriale);
    }
}
