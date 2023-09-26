package edu.avogadro;

import javax.swing.*;

public class Esercizio7Referendum {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Iscritti");
        int numIscr = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Voti SI");
        int votiSI = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Voti NO");
        int votiNO = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Schede bianche o nulle");
        int votiBiancheNulle = Integer.parseInt(input);
        int votanti = votiNO+votiSI+votiBiancheNulle;
        double votantiPerc = votanti*100.0/numIscr;
        double  siPercIscritti = votiSI*100.0/numIscr;
        double noPercIscritti = votiNO*100.0/numIscr;
        double siPercVotanti = votiSI*100.0/votanti;
        double noPercVotanti = votiNO*100.0/votanti;
        String output = String.format("Il totale degli iscritti è: "+votanti+"\n"+
                "La percentuale degli iscritti è: %5.2f %%"+"\n"+
                "Gli iscritti che hanno votato si è: %5.2f %%"+"\n"+
                "Gli iscritti che hanno votato no è: %5.2f %%"+"\n"+
                "I votanti che hanno votato si è: %5.2f %%"+"\n"+
                "I votanti che hanno votato no è: %5.2f %%", votantiPerc, siPercIscritti, noPercIscritti, siPercVotanti,noPercVotanti);
        JOptionPane.showMessageDialog(null, output);



    }
}
