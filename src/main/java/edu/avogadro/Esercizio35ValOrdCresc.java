package edu.avogadro;

import javax.swing.*;

public class Esercizio35ValOrdCresc {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));

        if (a <= b && b <= c && c <= d) {
            System.out.println("I valori sono in ordine crescente.");
        } else {
            System.out.println("I valori non sono in ordine crescente.");
        }
    }
}

