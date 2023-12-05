package edu.avogadro;

import javax.swing.*;

public class Esercizio88 {
    public static void main(String[] args) {
        //Scrivere il quadrato dei primi n numeri naturali come soppa dei primi dispari
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        int somma = 0;
        for (int i = 1; i <= n; i++) {
            somma += i;
            output += (output.equals("") ? "" : ",") + somma;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
