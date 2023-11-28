package edu.avogadro;

import javax.swing.*;

public class Esercizio75McM2Num {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire un numero");
        int b = Integer.parseInt(input);
        int somA = a;
        int somB = b;
        while (somA != somB) {
            if (somA < somB) {
                somA += a;
            } else {
                somB += b;
            }
        }
        JOptionPane.showMessageDialog(null, "il risultato è: "+somA);

    }
}
