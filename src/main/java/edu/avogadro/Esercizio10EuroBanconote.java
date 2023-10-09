package edu.avogadro;

import javax.swing.*;
public class Esercizio10EuroBanconote {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un valore in euro");
        int euro =  Integer.parseInt(input);
        int cinquanta = euro / 50;
        int resto = euro % 50;
        int venti = resto / 20;
        resto = resto % 20 ;
        int dieci = resto / 10;
        resto = resto % 10;
        int cinque = resto / 5;
        resto = resto % 5;
        int due = resto / 2;
        int uno = resto % 2;
        String output = String.format("Le banconote da 50 sono: %d"+"\n"+
                "Le banconote da 20 sono: %d"+"\n"+
                "Le banconote da 10 sono: %d"+"\n"+
                "Le banconote da 5 sono: %d"+"\n"+
                "Le monete da 2 sono: %d"+"\n"+
                "Le monete da 1 sono: %d", cinquanta, venti, dieci, cinque, due, uno);
        JOptionPane.showMessageDialog(null, output);

    }
}
