package edu.avogadro;

import javax.swing.*;

public class Esercizio39StessoSegnoInMagg {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore"));
        int contaPos = 0;
        String outPos = "";
        String outNeg = "";
        if (a >= 0 ) {
            contaPos++;
            outPos += " "+a;
        } else {
            outNeg += " "+a;
        }
        if (b >= 0) {
            contaPos++;
            outPos += " "+b;
        } else {
            outNeg += " "+b;
        }
        if (c >= 0) {
            contaPos++;
            outPos += " "+c;
        }else {
            outNeg += " "+c;
        }
        if (contaPos >= 2) {
            JOptionPane.showMessageDialog(null, outPos.substring(1));
        }else {
            JOptionPane.showMessageDialog(null, outNeg.substring(1));
        }




    }
}
