package edu.avogadro;

import javax.swing.*;

public class Esercizio38TreNumStessoSegno {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo valore"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo valore"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire il terzo valore"));

        if (a <= 0 && b <= 0 && c <= 0 ){
            JOptionPane.showMessageDialog(null, "I numeri hanno lo stesso segno");
        } else if (a >= 0 && b >= 0 && c >= 0) {
            JOptionPane.showMessageDialog(null, "I numeri hanno lo stesso segno");

        } else {
            JOptionPane.showMessageDialog(null, "I numeri hanno i segni diversi");
        }
    }
}
