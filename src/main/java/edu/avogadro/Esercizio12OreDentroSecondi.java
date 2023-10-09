package edu.avogadro;

import javax.swing.*;

public class Esercizio12OreDentroSecondi {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire le ore");
        int ore = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i minuti");
        int minuti = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i secondi");
        int secondi = Integer.parseInt(input);
        int sec = ore * 3600;
        int min = minuti * 60;
        int sectot = sec + min + sec;
        String output = String.format("Il tempo "+ore+":"+minuti+":"+secondi+" equivale a %d secondi", sectot);
        JOptionPane.showMessageDialog(null, output);

    }
}
