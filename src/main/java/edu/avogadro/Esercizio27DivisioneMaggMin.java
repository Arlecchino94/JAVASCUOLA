package edu.avogadro;

import javax.swing.*;

public class Esercizio27DivisioneMaggMin {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo numero"));
        int min,max;
        int quoz,resto;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        if (min == 0) {
            JOptionPane.showMessageDialog(null, "Il quoziente non si può fare");
        } else {
            quoz = max / min;
            resto = max % min;
            JOptionPane.showMessageDialog(null, "Il quoziente è: "+ quoz + "\n" +
                    "Il resto è: " +resto);
        }
    }
}
