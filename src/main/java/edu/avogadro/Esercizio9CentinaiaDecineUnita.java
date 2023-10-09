package edu.avogadro;

import javax.swing.*;

public class Esercizio9CentinaiaDecineUnita {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un valore minore di 10000");
        int intero = Integer.parseInt(input);
        int migliaia = intero / 10000;
        int centinaia = migliaia % 100;
        int decine = centinaia % 10;
        int unita = decine % 1;
        String output = String.format(
                "Migliaia %d"+"\n" +"Centinaia %d"+"\n"
                        +"decine %d"+"\n"
                        +"unità %d", centinaia, decine, unita);
        JOptionPane.showMessageDialog(null, output);

    }
}