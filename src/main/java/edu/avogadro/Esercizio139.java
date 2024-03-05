package edu.avogadro;

import javax.swing.*;

public class Esercizio139 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int cont = 1;
        String output = "";
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output += " "+cont+" ";
                cont++;
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
