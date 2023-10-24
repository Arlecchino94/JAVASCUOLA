package edu.avogadro;

import javax.swing.*;

public class Esercizio41Vocale {
    public static void main(String[] args) {
        String carattere = JOptionPane.showInputDialog("Inserire un carattere");
        char c = carattere.charAt(0);
        c = Character.toLowerCase(c);
        String output = "";
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            output = "Il carattere "+c+" è una vocale";
        }else{
            output = "Il carattere  "+c+" non è una vocale";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
