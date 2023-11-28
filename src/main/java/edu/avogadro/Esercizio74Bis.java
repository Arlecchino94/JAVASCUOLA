package edu.avogadro;

import javax.swing.*;

import java.math.BigInteger;

public class Esercizio74Bis {
    public static void main(String[] args) {
        //Calcolare il fattoriale di un numero
        String input = JOptionPane.showInputDialog("Inserire un numero");
        long n = Long.parseLong(input);
        BigInteger fattoriale = new BigInteger("1");
        for (long i = 1; i <= n; i++) {
            fattoriale = fattoriale.multiply(BigInteger.valueOf(i));
        }
        JOptionPane.showMessageDialog(null, "Il risultato è: "+fattoriale);
    }
}