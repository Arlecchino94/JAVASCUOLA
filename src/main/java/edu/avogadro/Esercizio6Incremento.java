package edu.avogadro;

import javax.swing.*;

public class Esercizio6Incremento {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire la popolazione prima dei 2 anni");
        int pop1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire la popolazione dopo i 2 anni ");
        int pop2 = Integer.parseInt(input);
        int IncrEff = pop2-pop1;
        double IncrPerc = IncrEff*100.0/pop1;
        String output = String.format("La popolazione è aumentata di %d abitanti e in percentuale del %5.2f %%", IncrEff, IncrPerc);
        JOptionPane.showMessageDialog(null, output);

    }
}
