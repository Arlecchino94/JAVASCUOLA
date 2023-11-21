package edu.avogadro;

import javax.swing.*;

public class Esercizio70AddizzioniSuccessive {
    public static void main(String[] args) {
        //Calcolare il prodotto di due numeri negativi o positivi procedendo per addizioni successive
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire un numero");
        int b = Integer.parseInt(input);
        int somma = 0;
        int incr = 1;
        int a1 = a;
        int b1 = b;
        if (b < 0) {
            a = -a;
            b = -b;
        }
        for (int i = 1; i <= b; i++) {
            somma = somma + a;
        }
        JOptionPane.showMessageDialog(null, "La somma di "+a+" e "+b+" vale: "+somma);
    }
}
