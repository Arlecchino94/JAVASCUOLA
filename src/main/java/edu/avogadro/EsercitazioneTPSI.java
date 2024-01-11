package edu.avogadro;

import javax.swing.*;



public class EsercitazioneTPSI {

    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int media = (min+max)/2;
        boolean indovinato = false;
        boolean gioco = false;
        String output = "";
        JOptionPane.showMessageDialog(null, "Indovinerò un numero tra 1 e 1000");
        String input = JOptionPane.showInputDialog("vuoi iniziare?");
        if (input.equals("si")){
            gioco = true;
        }
        while (gioco) {

            JOptionPane.showMessageDialog(null, "Pensa un numero!");

            while (true) {

                String inputt = JOptionPane.showInputDialog("Il numero è maggiore o minore di " + media);
                if (inputt.equals("maggiore")) {
                    min = media + 1;
                    media = (min + max) / 2;
                }
                if (inputt.equals("minore")) {
                    max = media - 1;
                    media = (min + max) / 2;
                }
                if (inputt.equals("uguale")) {
                    JOptionPane.showMessageDialog(null, "La risposta è: " + media);
                    min = 1;
                    max = 1000;
                    media = (min + max) / 2;
                    input = JOptionPane.showInputDialog("Vuoi ricominciare?");
                    break;
                }
                if (media > 1000) {
                    output = "Il numero che stai pensando non è tra 1 e 1000 oppure stai cambiando idea di frequente ;D";
                    break;
                }
            }
            if (input.equals("si")){
                gioco = true;
            }else {
            gioco = false;
            }
        }



    }
}