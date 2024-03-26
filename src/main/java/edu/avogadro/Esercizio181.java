package edu.avogadro;

import javax.swing.*;

public class Esercizio181 {
    public static void main(String[] args) {
        //leggere un vettore di caratteri e dire quante volte compare ciascuna delle vocali
        String output = "";
        String s = JOptionPane.showInputDialog("Inserire caratteri");
        int[] freq = new int[5];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (Character.toLowerCase(c)){
                case 'a' : freq[0]++; break;
                case 'e' : freq[1]++; break;
                case 'i' : freq[2]++; break;
                case 'o' : freq[3]++; break;
                case 'u' : freq[4]++; break;
            }
        }
        for (int i = 0; i <= 4; i++) {
            output += freq[i]+" ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}