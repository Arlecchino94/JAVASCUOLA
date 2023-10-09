package edu.avogadro;

import javax.swing.*;

public class Esercizio15SommaOrari {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire le ore del primo orario");
        int ore1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i minuti del primo orario");
        int min1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i secondi del primo orario");
        int sec1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire le ore del secondo orario");
        int ore2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i minuti del secondo orario");
        int min2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i secondi del secondo orario");
        int sec2 = Integer.parseInt(input);
        int secc1 = ore1 * 3600 + min1 * 60 + sec1;
        int secc2 = ore2 * 3600 + min2 * 60 + sec2;
        int diff = secc2 + secc1;
        int h = diff / 3600;
        int resto = diff % 3600;
        int min = resto / 60;
        int sec = resto % 60;
        String output = String.format("La somma in ore è: %d, la somma in minuti è: %d, la somma in secondi è: %d", h, min, sec);
        JOptionPane.showMessageDialog(null, output);
    }
}
