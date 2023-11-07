package edu.avogadro;

import javax.swing.*;

public class Esercizio57CicloEquazione {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        String output= "";
        double x;
        while (!input.equals("")) {
            double a = Double.parseDouble(input);
            input = JOptionPane.showInputDialog("Inserire un numero");
            double b = Double.parseDouble(input);
            if (a == 0) {
                if (b == 0){
                    output = "Infinite soluzioni";
                }else {
                    output = "Nessuna soluzione";
                }
            }else {
                x = -b/a;
                output = "La soluzione è x = "+x;
            }
            JOptionPane.showMessageDialog(null, output);
            input = JOptionPane.showInputDialog("Inserire un numero");

        }
    }
}
