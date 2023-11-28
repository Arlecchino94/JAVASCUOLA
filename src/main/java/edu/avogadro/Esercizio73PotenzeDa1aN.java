package edu.avogadro;


import javax.swing.*;

public class Esercizio73PotenzeDa1aN {
    public static void main(String[] args) {
        //calcolare tutte le potenze da UNO a P dei valori da UNO a N
        String input = JOptionPane.showInputDialog("Inserire colonne");
        int n = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire riga");
        int p = Integer.parseInt(input);
        String outputGlobale = "";

        for (int i = 1; i <= n; i++) {
            int potenza = 1;
            String output = "";
            for (int j = 1; j <= p; j++) {
                potenza = potenza * i;
                output += (output.equals("")?"":",")+ String.format("%4d", potenza);
            }
            outputGlobale += (output.equals("")?"":"\n")+output;
        }
        JOptionPane.showMessageDialog(null, outputGlobale);
    }
}
