package edu.avogadro;

import javax.swing.*;

public class Esercizio2GradiFaren {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire Gradi in Centigradi");
        double c = Double.parseDouble(input);
        double f = 9.0/5.0*c+32;
        JOptionPane.showMessageDialog(null, "I gradi Fahrenheit sono: "+f+" gradi");
    }
}
