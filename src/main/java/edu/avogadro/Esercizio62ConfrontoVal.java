package edu.avogadro;

import javax.swing.*;

public class Esercizio62ConfrontoVal {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        double n = Double.parseDouble(input);
        double mag  = 0;
        double min = 0;
        double uguali = -1;
        while (!input.equals("")) {
            double n1 = Double.parseDouble(input);
            if (n1 < n) {
                min++;
            }else if (n1 > n) {
                mag++;
            }else if (n1 == n) {
                uguali++;
            }
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
        JOptionPane.showMessageDialog(null, "I numeri maggiori sono: "+mag+"\n"+
                "I numeri minori sono: "+min+"\n"+
                "I numeri uguali sono: "+uguali);
    }
}
