package edu.avogadro;

import javax.swing.*;

public class Esercizio56PariDispari {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        while (!input.equals("")) {
            int n = Integer.parseInt(input);
            if (n % 2 ==0) {
                JOptionPane.showMessageDialog(null, "Il numero è pari");
            }else {
                JOptionPane.showMessageDialog(null, "Il numero è dispari");
            }
            input = JOptionPane.showInputDialog("Inserire un numero");
        }

    }
}
