package edu.avogadro;

import javax.swing.*;

public class Esercizio3GradiCentigradi {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire Gradi in Fahrenheit");
        double f = Double.parseDouble(input);
        double c = (f-32)*5.0/9.0;
        JOptionPane.showMessageDialog(null, "I gradi Centigradi sono: "+c+" gradi");
    }
}
