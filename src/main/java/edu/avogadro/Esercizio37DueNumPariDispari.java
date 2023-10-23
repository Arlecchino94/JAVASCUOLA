package edu.avogadro;

import javax.swing.*;

public class Esercizio37DueNumPariDispari {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));

        if (a % 2 == 0 && b % 2 == 0){
            JOptionPane.showMessageDialog(null, "I numeri sono pari");

        }else if (a % 2 == 1 && b % 2 == 1) {
            JOptionPane.showMessageDialog(null, "I numeri sono dispari ");
        }

    }
}
