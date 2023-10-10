package edu.avogadro;

import javax.swing.*;

public class Eserciziio27DivisioneMaggMin {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo numero"));
        int min;
        int max;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min =b;
            max = a;
        }
        int quoz = max / min;
        int resto = max % min;
        JOptionPane.showMessageDialog(null, "Il quoziente è: "+quoz+"\n"+
                "Il resto è: "+resto);

    }
}
