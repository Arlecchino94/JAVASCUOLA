package edu.avogadro;

import javax.swing.*;

public class Esercizio164 {
    public static void main(String[] args) {
        // un testo, memorizzato in un vettore di caratteri,
        // è composto da frasi, ogni frase termina con punto; contare il numero
        // delle parole per frase, la lunghezza media di una frase
        String s = JOptionPane.showInputDialog("Inserire testo");
        char c;
        int lungFrase = 0;
        char contparole = 0;
        char numfrasi = 0;
        int lunghezze = 0;
        String output = "";
        boolean inParola = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '.'){
                numfrasi++;
                output += contparole;
                contparole = 0;
                lunghezze += lungFrase;
                lungFrase = 0;
                inParola = false;
            }else if (c != ' ') {
                lungFrase++;
                if (!inParola){
                    inParola = true;
                    contparole++;
                }
            }else {
                inParola = false;
                lungFrase++;
            }
        }
        int media = lunghezze / numfrasi;
        JOptionPane.showMessageDialog(null, numfrasi + " "+ media);
    }
}
