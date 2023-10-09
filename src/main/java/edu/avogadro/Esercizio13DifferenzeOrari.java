package edu.avogadro;

import javax.swing.*;

public class Esercizio13DifferenzeOrari {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire le ore del primo orario");
        int ore1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i minuti del primo orario");
        int min1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i secondi del primo orario");
        int sec1 =  Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire le ore del secondo orario");
        int ore2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i minuti del secondo orario");
        int min2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire i secondi del secondo orario");
        int sec2 = Integer.parseInt(input);
        int diff = (ore1-ore2)*3600 + (min1-min2)*60+ sec1-sec2;
        String output = String.format("La differenza è: %d secondi", diff);
        JOptionPane.showMessageDialog(null, output);
    }
}
