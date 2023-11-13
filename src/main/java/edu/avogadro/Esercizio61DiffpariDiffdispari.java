package edu.avogadro;

import javax.swing.*;

public class Esercizio61DiffpariDiffdispari {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int Pari = 0;
        int Disp = 0;
        while (!input.equals("")) {
            int n = Integer.parseInt(input);
            if (n % 2 == 0) {
                Pari += n;
            }else {
                Disp += n;
            }
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
        int diff = Math.abs(Pari-Disp);
        JOptionPane.showMessageDialog(null, "La differenza tra i numeri Pari e i numeri Dispari è:"+diff);
    }
}
