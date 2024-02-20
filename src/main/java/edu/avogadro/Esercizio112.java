package edu.avogadro;

import javax.swing.*;

public class Esercizio112 {
    public static void main(String[] args) {
        //Dire quanti numeri naturali pari a partire da due occorre moltiplicare per superare un valore N
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero "));
        int pari = 2;
        int molt = 1;
        int i = 0;
        while (molt <= n) {
            molt *= pari;
            pari += 2;
            i++;
        }
        JOptionPane.showMessageDialog(null, "I numeri naturali che servono per arrivare a "+n+" sono: "+i);
    }
}
