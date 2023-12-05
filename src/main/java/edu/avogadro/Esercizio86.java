package edu.avogadro;

import javax.swing.*;

public class Esercizio86 {
    public static void main(String[] args) {
        //Stampare i quadrati perfetti minori di un valore n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 1; i * i < n; i++) {
            output += (output.equals("")?"":",")+(i*i);
        }
        JOptionPane.showMessageDialog(null, output);


    }
}
