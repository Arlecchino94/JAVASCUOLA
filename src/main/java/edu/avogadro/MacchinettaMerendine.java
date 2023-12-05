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
        String input = JOptionPane.showInputDialog("Scegliere tra: "+"\n"+
                "1 -  Patatine" + "\n" +
                "2 -  Caramelle" + "\n" +
                "3 - Cioccolato");
        int sel = Integer.parseInt(input);
        while (!input.equals("")) {

        }

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
