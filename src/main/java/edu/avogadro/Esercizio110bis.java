package edu.avogadro;

import javax.swing.*;

public class Esercizio110bis {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti numeri pari vuoi visualizzare"));
        int num = 1;
        String output = "";
        for(int contPari = 0; contPari < n;contPari++) {
            output += (output.equals("")?"":",")+num*2;
            num++;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}