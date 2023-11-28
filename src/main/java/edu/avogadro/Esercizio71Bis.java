package edu.avogadro;

import javax.swing.*;

public class Esercizio71Bis {
    public static void main(String[] args) {
        //Calcolare la potenza di un numero procedendo per moltiplicazioni successive
        String input = JOptionPane.showInputDialog("Inserire la base");
        double base = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire l'esponente");
        int esponente = Integer.parseInt(input);
        double base1 = base;
        int esponente1 = esponente;
        if (esponente < 0) {
            base1 = 1/base;
            esponente1 = -esponente1;
        }
        double potenza = 1;
        for (int i = 1; 1 <= esponente1; i++) {
            potenza += base1;
        }
        JOptionPane.showMessageDialog(null, String.format("%f^%d = %f", base, esponente, potenza));
    }
}
