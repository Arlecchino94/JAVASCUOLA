package edu.avogadro;

import javax.swing.*;

public class Esercizio29RadiceQuadrata {
    public static void main(String[] args) {
        double a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il valore"));
        if (a < 0) {
            a = -a;
        }
        JOptionPane.showMessageDialog(null, "La radice quadrata è: " + Math.sqrt(a));
    }
}
