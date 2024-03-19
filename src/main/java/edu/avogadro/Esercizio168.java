package edu.avogadro;

import javax.swing.*;

public class Esercizio168 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Numero da decidere se è palindromo o non è palindromo");
        boolean palindroma = true;
        String output ="";
        for (int i = 0; i < n.length()/2; i++) {
            if (n.charAt(i)!= n.charAt(n.length()-i-1)){
                palindroma = false;
            }
        }
        if (palindroma){
            output += n + " è palindroma";
        }else {
            output += n + " non è palindroma";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}