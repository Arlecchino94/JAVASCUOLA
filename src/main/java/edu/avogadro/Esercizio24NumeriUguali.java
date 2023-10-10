package edu.avogadro;

import javax.swing.*;

public class Esercizio24NumeriUguali {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserisci il primo valore");
        int n1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire il secondo valore");
        int n2 = Integer.parseInt(input);
        String output = "";
        if (n1 % n2 == 0 || n2 % n1 == 0) {
            output = "";
        } else {
            output = " non";
        }
        JOptionPane.showMessageDialog(null, n1 + " è " + n2 + output+ " sono divisibili");
    }
}
