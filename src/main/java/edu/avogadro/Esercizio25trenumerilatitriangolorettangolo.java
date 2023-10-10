package edu.avogadro;

import javax.swing.*;

public class Esercizio25trenumerilatitriangolorettangolo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire n1");
        double a = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire n2");
        double b = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire n3");
        double c = Double.parseDouble(input);
        String output = "";
        if (a*a+b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            output = "";
        } else {
            output = " non";
        }
        JOptionPane.showMessageDialog(null, a + "," + b + " e" + c + output + " sono i lati di un triangolo rettangolo");
    }
}
