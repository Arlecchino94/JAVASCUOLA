package edu.avogadro;

import javax.swing.*;

public class Esercizio115 {
    public static void main(String[] args) {
        //Dato un numero, scrivere una sola volta tutti i suoi fattori primi
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int fatt = 1;
        int cont = 2;
        int divprec = 0;
        String output = "";
        while (n > fatt) {
            if (n % cont == 0) {
                n /= cont;
                if (divprec != cont) {
                    output += (output.equals("") ? "" : ",") + cont;
                }
                divprec = cont;
            } else {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
