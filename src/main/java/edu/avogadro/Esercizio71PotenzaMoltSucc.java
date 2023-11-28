package edu.avogadro;

import javax.swing.*;

public class Esercizio71PotenzaMoltSucc {
    public static void main(String[] args) {
        //Calcolare la potenza di un numero procedendo per moltiplicazioni successive
        String input = JOptionPane.showInputDialog("Inserire la base");
        double base = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire l'esponente");
        int esponente = Integer.parseInt(input);
        double potenza = 1;
        for (double cont = 0; cont < esponente; cont++) {
            if (esponente > 0) {
                potenza = potenza * base;  //potenza *= base;
            }else {
                potenza = potenza * (1 / base);
            }
        }
        JOptionPane.showMessageDialog(null, "Il risultato è: " + potenza);     //JOptionPane.showMessageDialog(null, String.format("%f^%d = %f", base, esponente, potenza));
    }
}
