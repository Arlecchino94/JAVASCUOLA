package edu.avogadro;

import javax.swing.*;

public class Esercizio85 {
    public static void main(String[] args) {
        //Stampare i primi n numeri che sono quadrati perfetti
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String output = "";
        for (int i = 1; i <= n; i++) {
            output += i*i+" ";
        }
        JOptionPane.showMessageDialog(null, output);

    }
    
}
