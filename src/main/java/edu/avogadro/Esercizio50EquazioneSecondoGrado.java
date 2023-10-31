package edu.avogadro;

import javax.swing.*;

public class Esercizio50EquazioneSecondoGrado {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire la X"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire la Y"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire numero noto"));
        String output = "";
        if (a == 0) {
            if (b == 0){
                if (c == 0) {
                    output = "Infinite soluzioni";
                }else {
                    output = "Nessuna soluzione";
                }
            }else {
                double sol = -c/b;
                output = "La soluzione x = "+sol;
            }
        }else {
            double delta = b*b-4*a*c;
            if (delta > 0){
                double sol1 = (-b+Math.sqrt(delta))/(2*a);
                double sol2 = (-b+Math.sqrt(delta))/(2*a);
                output = "Soluzione x1 = "+sol1+" x2 = "+sol2;
            }else if (delta == 0){
                double sol1 = -b/(2*a);
                output = "Due soluzioni coincidenti x = "+sol1;
            }else {
                output = "Nessuna soluzione nel campo reale";

            }

        }


    }
}
