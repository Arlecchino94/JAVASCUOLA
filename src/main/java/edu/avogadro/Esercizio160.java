package edu.avogadro;

import javax.swing.*;

public class Esercizio160 {
    //Dato un vettore di caratteri, dire quante volte compaiono due caratteri uguali consecutivamente
    public static void main(String[] args) {
        String c = JOptionPane.showInputDialog("Inserisci stringa");
        String output = "";
        char prec = 0;
        int cont = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == prec) {
                cont++;
                prec = 0;
            }
            prec = c.charAt(i);
        }
        output += cont;
        JOptionPane.showMessageDialog(null, output);
    }
}
