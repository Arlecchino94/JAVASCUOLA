package edu.avogadro;

import javax.swing.JOptionPane;

public class esercizio78 {
    public static void main(String[] args) {
        //trovare divisori interidi un numero n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        String output = "";
        for (int i = 1;i <= n;i++) {
            if (n % i == 0) {
                output += i+" ";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
