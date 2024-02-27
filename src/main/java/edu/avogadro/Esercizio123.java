package edu.avogadro;

import javax.swing.*;

public class Esercizio123 {
    public static void main(String[] args) {
        //Dato un numero, determinare il numero primo piu vicino
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int div = 0;
        String output = "";
        int i = n;
        boolean ciclo = true;
        boolean ciclo2 = true;
        while (ciclo) {
            div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == 2) {
                ciclo = false;
            } else {
                i++;
                if (i != 2 && i % 2 == 0) {
                    i++;
                }
            }
        }
        int magg = i;
        i = n;
        while (ciclo2) {
            div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == 2) {
                ciclo2 = false;
            } else {
                i--;
                if (i != 2 && i % 2 == 0) {
                    i--;
                }
            }
        }
        int min = i;
        i = n;
        int difmag = magg - n;
        int difmin = n - min;
        if (difmin == difmag) {
            JOptionPane.showMessageDialog(null, "I numeri primi più vicini alla stessa distanza sono: "+magg+" e "+min);
        }else if (difmin < difmag) {
            JOptionPane.showMessageDialog(null, "Il numero primo più vicino è: "+min);
        }else {
            JOptionPane.showMessageDialog(null, "Il numero primo iù vicino è: "+magg);
        }
    }
}
