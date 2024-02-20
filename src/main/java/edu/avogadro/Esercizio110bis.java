package edu.avogadro;

import javax.swing.*;

public class Esercizio110bis {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti numeri pari vuoi visualizzare"));
        int num = 1;
        int contPari = 0;
        String output = "";
        while (contPari < n) {
            output += (output.equals("")?"":",")+num*2;
            contPari++;
            num++;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}