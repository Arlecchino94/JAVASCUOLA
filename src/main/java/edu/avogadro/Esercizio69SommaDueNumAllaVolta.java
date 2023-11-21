package edu.avogadro;

import javax.swing.*;

public class Esercizio69SommaDueNumAllaVolta {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire un numero");
        int b = Integer.parseInt(input);
        int somma = a;
        int incr = 1;
        int b1 = b;
        if (b < 0) {
            incr = -1;
            b = -b;
        }for (int i = 1; i <= b; i++) {
            somma = somma + incr;
        }
        JOptionPane.showMessageDialog(null, "La somma di "+a+" e "+b1+" vale: "+somma);
    }
}
