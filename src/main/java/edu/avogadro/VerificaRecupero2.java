package edu.avogadro;

import javax.swing.*;

public class VerificaRecupero2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numeri cicli."));
        int sommaPari = 0;
        int sommaDispari = 0;
        int cont = 1;
        while (cont <=n){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero"));
            if ( input %2 == 0){
                sommaPari+=input;
            } else {
                sommaDispari += input;
            }
            cont++;
        }
        if (sommaPari>sommaDispari){
            JOptionPane.showMessageDialog(null,"La somma dei pari è maggiore.");
        } else if ( sommaDispari>sommaPari){
            JOptionPane.showMessageDialog(null,"La somma dei dispari è maggiore.");
        } else {
            JOptionPane.showMessageDialog(null,"Le due somme sono uguali.");
        }
    }
}