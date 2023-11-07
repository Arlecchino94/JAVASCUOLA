package edu.avogadro;

import javax.swing.*;

public class Esercizio54RipetereQuPerimetroArea {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        while (!input.equals("")) {
            double lato = Double.parseDouble(input);
            double area = lato * lato;
            double perimetro = lato*4;
            JOptionPane.showMessageDialog(null,
                    String.format("L'area del quadrato è %5.2f e il perimetro del quadrato è %5.2f", area, perimetro));
            input = JOptionPane.showInputDialog("Inserisci un numero");
        }
    }
}
