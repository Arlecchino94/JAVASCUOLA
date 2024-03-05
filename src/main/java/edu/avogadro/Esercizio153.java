package edu.avogadro;

import javax.swing.*;

public class Esercizio153 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza Vett"));
        int[] numeri = new int[n];
        int pari = 0;
        int dispari = 0;
        int nulli = 0;

        String output = "";
        for (int i = 0; i < n; i++) {
            numeri[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            if (numeri[i] % 2 == 0 && numeri[i] != 0) {
                pari++;
            }
            if (numeri[i] % 2 == 1) {
                dispari++;
            }
            if (numeri[i]== 0) {
                nulli++;
            }
        }
        JOptionPane.showMessageDialog(null, "I numeri pari sono: "+pari+"\n"+"I numeri dispari sono: "+dispari+"\n"+"I numeri nulli sono: "+nulli);
    }
}
