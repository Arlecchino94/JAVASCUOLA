package edu.avogadro;

import javax.swing.*;
import java.util.Scanner;

public class Esercizio36Dati4Valori2Uguali {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il terzo valore"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Inserire il qaurto valore"));

        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            JOptionPane.showMessageDialog(null, "Ci sono almeno 2 numeri uguali");
        }else {
            JOptionPane.showMessageDialog(null, "Non ci sono numeri uguali");
        }


    }
}
