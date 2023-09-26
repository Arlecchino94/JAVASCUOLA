package edu.avogadro;

import javax.swing.*;

public class Esercizio6Incremento {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire la popolazione prima dei 2 anni");
        double pop1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire la popolazione dopo i 2 anni ");
        double pop2 = Double.parseDouble(input);
        double IncrEff = pop2-pop1;
        double IncrPerc = IncrEff/pop1*100;
        JOptionPane.showMessageDialog(null, "L'incremento effettivo è: "+IncrEff+"\n"+
                "La percentuale di incremento è del: "+IncrPerc+"%");
    }
}
