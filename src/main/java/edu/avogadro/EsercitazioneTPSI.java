package edu.avogadro;

import javax.swing.*;
import java.util.Random;


public class EsercitazioneTPSI {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserisci un numero da indovinare");
        int n = Integer.parseInt(input);
        int a = 1;
        int b = 1000;
        int f1;
        int u1;
        String output ="";

        while (!input.equals(""));
        int media = (a+b)/2;
        output = "Il numero è maggiore o minore di: "+media;
        if (n < media) {
            f1 = (a+media)/2-1;
            int media2 = (a+media)/2;
            output = "il numero è maggiore o minore di: "+media2;
            if (n < media2) {
                f1 = (a + media2)/2-1;
                int media3 = (a+media2)/2;
                output = "Il numero è maggiore o minore di: "+ media3;
            }
        }else if (n > media) {
            u1 = (media + b) / 2 + 1;
        }
    }
}