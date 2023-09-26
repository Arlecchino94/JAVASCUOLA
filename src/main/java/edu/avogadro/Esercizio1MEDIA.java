package edu.avogadro;

import javax.swing.*;

public class Esercizio1MEDIA {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire numero 1");
        double a = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire numero 2");
        double b = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire numero 3");
        double c = Double.parseDouble(input);
        double media = (a+b+c)/3;
        JOptionPane.showMessageDialog(null, "La media è: "+media);
    }
}
