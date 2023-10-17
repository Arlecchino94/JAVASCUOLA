package edu.avogadro;

import javax.swing.*;

public class Esercizio33MisureLatiTriangolo {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il terzo valore"));
        int max;
        if (a < b) {
            max = b;
        }else {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        int somma = a+b+c-max;
        String output = "";
        if (max < somma) {
            output = "è un triangolo";
            if (a == b && a == c) {
                output +=" equilatero";
            } else if (a == b || a == c || b == c) {
                output +=" isoscele";
            } else {
                output +=" scaleno";
            }
        }else {
            output = "Non è un triangolo";
        }
        JOptionPane.showMessageDialog(null, output);
    }

}
