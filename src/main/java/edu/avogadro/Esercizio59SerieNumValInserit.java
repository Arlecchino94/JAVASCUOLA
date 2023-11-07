package edu.avogadro;

import javax.swing.*;

public class Esercizio59SerieNumValInserit {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int cont= 0;
        while (!input.equals("")) {
            cont++;
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
        JOptionPane.showMessageDialog(null, "I valori inseriti sono: "+cont);
    }
}
