package edu.avogadro;

import javax.swing.*;

public class Esercizio40GiorniMese {
    public static void main(String[] args) {
        int mese = Integer.parseInt(JOptionPane.showInputDialog("Inserire un mese da 1 a 12"));

        if (mese == 2) {
            JOptionPane.showMessageDialog(null, "Il mese contiene 28 giorni");
        } else if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            JOptionPane.showMessageDialog(null, "Il mese contiene 30 giorni");
        }else{
            JOptionPane.showMessageDialog(null, "Il mese contiene 31 giorni");
        }
    }
}
