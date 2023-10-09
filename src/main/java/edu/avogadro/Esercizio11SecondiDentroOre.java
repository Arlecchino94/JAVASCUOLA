package edu.avogadro;

import javax.swing.*;

public class Esercizio11SecondiDentroOre {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire il valore in secondi");
        int tempo = Integer.parseInt(input);
        int ore = tempo / 3600;
        int resto = tempo % 3600;
        int minuti = resto / 60;
        resto = resto % 60;
        int secondi = resto % 60;
        String output = String.format("Il tempo dato è composto da: %d ore, %d minuti e %d secondi", ore, minuti, secondi);
        JOptionPane.showMessageDialog(null, output);
    }
}
