package edu.avogadro;

import javax.swing.*;

public class Esercizio89 {
    public static void main(String[] args) {
        //Sommare i numeri compresi tra n1 e n2 (non si sa quale è piu piccolo)
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int max = 0;
        int min = 0;
        if (n1 < n2) {
            min = n1;
            max = n2;
        }else {
            max = n1;
            min = n2;
        }
        int somma = 0;
        for (int i = min; i <= max; i++) {
            somma += i;
        }
        JOptionPane.showMessageDialog(null, somma);
    }
}
