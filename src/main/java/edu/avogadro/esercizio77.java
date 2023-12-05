package edu.avogadro;

import javax.swing.JOptionPane;

public class esercizio77 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti multipli"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci di quale numero"));
        String output = "";
        for (int i = 1;i <= a;i++) {
            output += n*i+" ";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
