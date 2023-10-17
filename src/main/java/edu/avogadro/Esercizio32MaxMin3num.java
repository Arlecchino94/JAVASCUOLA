package edu.avogadro;

import javax.swing.*;

public class Esercizio32MaxMin3num {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il terzo valore"));
        int min,max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        JOptionPane.showMessageDialog(null, "Il numero maggiore è: "+max + "\n" + "Il numero minore è: "+ min);

    }
}