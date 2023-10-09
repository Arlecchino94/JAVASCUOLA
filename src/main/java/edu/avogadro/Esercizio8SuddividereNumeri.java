package edu.avogadro;

import javax.swing.*;

public class Esercizio8SuddividereNumeri {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un valore");
        double n = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserisci il valore di A");
        double a = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserisci il valore di B");
        double b = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserisci il valore di C");
        double c = Double.parseDouble(input);
        double suddivisione = n/(a+b+c);
        double sa = suddivisione*a;
        double sb = suddivisione*b;
        double sc = suddivisione*c;
        String output = String.format("Il valore di "+a+"è uguale a %5.2f"+"\n"+
                "il valore di "+b+"\n");
        JOptionPane.showMessageDialog(null, output);





    }
}
