package edu.avogadro;

import javax.swing.*;

public class Esercizio58CiclloSommaNegPos {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        double sommaPos = 0;
        double sommaNeg = 0;
        while (!input.equals("")) {
            double a = Double.parseDouble(input);
            if (a >= 0) {
                sommaPos += a;
            } else {
                sommaNeg += a;
            }
            input = JOptionPane.showInputDialog("Inserire un numero");

        }
        JOptionPane.showMessageDialog(null, "La somma dei postivi è: "+sommaPos+"\n"+
                "La somma dei negativi è: "+sommaNeg);



    }
}
