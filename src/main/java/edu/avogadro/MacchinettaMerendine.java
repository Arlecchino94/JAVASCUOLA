package edu.avogadro;

import javax.swing.*;

public class MacchinettaMerendine {
    public static void main(String[] args) {
        int patatine = 20;
        int caramelle = 25;
        int cioccolato = 15;
        double pat = 0.50;
        double car = 0.70;
        double cio = 0.80;
        int m10 = 80;
        int m20 = 60;
        int m50 = 50;
        int A = patatine;
        int B = caramelle;
        int C = cioccolato;

        String input = JOptionPane.showInputDialog("Scegliere tra: "+"\n"+
                "A -  Patatine" + "\n" +
                "B -  Caramelle" + "\n" +
                "C -  Cioccolato");
        int sel = Integer.parseInt(input);
        while (!input.equals("")) {
            double mon =


            if (patatine == 0) {
                JOptionPane.showMessageDialog(null, "Non disponibile");
            }
            if (caramelle == 0) {
                JOptionPane.showMessageDialog(null, "Non disponibile");
            }
            if (cioccolato == 0) {
                JOptionPane.showMessageDialog(null, "Non disponibile");
            }
        }
    }
}
