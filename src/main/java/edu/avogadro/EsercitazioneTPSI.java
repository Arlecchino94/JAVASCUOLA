package edu.avogadro;


import javax.swing.*;



public class EsercitazioneTPSI {


    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int media = (min+max)/2;
        String output = "";
        output = "Inizio";
        String input = JOptionPane.showInputDialog("Vuoi iniziare?");
        while (input.equals("si")) {
            String inputt = JOptionPane.showInputDialog("Il numero è maggiore o minore di: "+media);
            if (inputt.equals("maggiore")) {
                min = media +1;
                media = (min+max)/2;
            }
            if (inputt.equals("minore")) {
                max = media -1;
                media = (min+max)/2;
            }
            if (inputt.equals("uguale")) {
                JOptionPane.showMessageDialog(null, "La riposta è:"+media);
                input  = JOptionPane.showInputDialog("Vuoi ricominciare?");
                min = 1;
                max = 1000;
                media = (min+max)/2;
            }
            if (media == 0) {
                JOptionPane.showMessageDialog(null, "Non è un numero tra 1 e 1000");
                break;
            }


        }

    }
}
