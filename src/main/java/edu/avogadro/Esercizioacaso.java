package edu.avogadro;

import javax.swing.*;

public class Esercizioacaso {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Inserire frase");
        String[] parole = new String[50];
        int[] frequenza = new int[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == ' ' || frase.charAt(i) == ',' || frase.charAt(i)== '.')) {
                parole[i] = frase;
                frequenza[i]++;
            }
        }
        JOptionPane.showMessageDialog(null, frequenza);

    }


    public static void controllo(String input, String[] parole){
        
    }


    
}
