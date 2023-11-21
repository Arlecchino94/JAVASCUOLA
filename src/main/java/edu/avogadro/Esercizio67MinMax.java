package edu.avogadro;

import javax.swing.*;

public class Esercizio67MinMax {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un valore");
        String output = "";
        double min = 0;
        double min1 = 0;
        double n = 0;
        if (input == "") {
            output = "Sequenza vuota";
        }else {
            min = Double.parseDouble(input);
            input = JOptionPane.showInputDialog("Inserire un valore");
            if (input == ""){
                output = "Sequenza con un solo valore: min = "+min;
            }else {
                n = Double.parseDouble(input);
                if (n < min) {
                    min1 = min;
                    min = n;
                }
            }
            input = JOptionPane.showInputDialog("Inserire un valore");
            while (!input.equals("")) {
                n = Double.parseDouble(input);
                if (n < min) {
                    min1 = min;
                    min = n;
                }else if (n < min1) {
                    min1 = n;
                }
                input = JOptionPane.showInputDialog("Inserire un valore");
            }
            output = "min = "+min+" min1 ="+min1;
        }
        JOptionPane.showMessageDialog(null, "il numero minore è: "+min+"\n"
        +"Il numero subito dopo il minore è: "+min1);
    }

}