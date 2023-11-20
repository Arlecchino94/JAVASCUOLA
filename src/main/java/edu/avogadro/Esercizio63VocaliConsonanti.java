package edu.avogadro;

import javax.swing.*;

public class Esercizio63VocaliConsonanti {
    public static void main(String[] args) {
        //Inserire una frase che termina col punto e contare le consonanti e le vocali
        String input = JOptionPane.showInputDialog("Inserire stringa");
        int idx = 0;
        int vocale = 0;
        int consonanti = 0;
        while (idx < input.length()) {
            char c = Character.toLowerCase(input.charAt(idx));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocale++;
            }else if (Character.isLetter(c)) {
                consonanti++;
            }
            idx++;
        }
        String output = "Ci sono "+vocale+" vocali e "+consonanti+" consonanti";
        JOptionPane.showMessageDialog(null, output);
    }
}
