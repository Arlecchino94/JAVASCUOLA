package edu.avogadro;

import javax.swing.JOptionPane;

public class esercizio79 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        String output = "";
        for (int i = 1;i <= a;i++) {
            if (a % i == 0) {
                output += " |"+i+" x "+a/i+"| ";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
