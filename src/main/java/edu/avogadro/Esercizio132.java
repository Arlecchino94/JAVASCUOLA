package edu.avogadro;

import javax.swing.*;

public class Esercizio132 {
    public static void main(String[] args) {
        // Stampare un quadrato di asterischi di lato N
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output += "  *  ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
