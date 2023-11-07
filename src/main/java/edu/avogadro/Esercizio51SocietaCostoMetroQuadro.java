package edu.avogadro;

import javax.swing.*;

public class Esercizio51SocietaCostoMetroQuadro {
    public static void main(String[] args) {
        double mquad = Double.parseDouble(JOptionPane.showInputDialog("Inserire i metri quadri"));
        double distMare = Double.parseDouble(JOptionPane.showInputDialog("Inserire la distanza in metri dal mare"));
        double tot;
        String output = "";
        if (distMare <= 200) {
            tot = 1800*mquad;
            output = "Il costo totale è di: "+tot;
        }
        if (distMare >= 201 && distMare <= 500){
            tot = 1500*mquad;
            output = "Il costo totale è di: "+tot;
        }
        if (distMare > 500){
            tot = 1000*mquad;
            output = "Il costo totale è di: "+tot;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
