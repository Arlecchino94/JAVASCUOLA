package edu.avogadro;

import javax.swing.*;

public class Esercizio182 {
    public static void main(String[] args) {
        //Leggere un vettore di caratteri e calcolare la frequenza di ciascuna lettera
        String output = "";
        String s = JOptionPane.showInputDialog("Inserire caratteri");
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                freq[c-'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            output += freq[i]+" ";
        }
        JOptionPane.showConfirmDialog(null, output);
    }
}
