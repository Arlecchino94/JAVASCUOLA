package edu.avogadro;

import javax.swing.*;

public class Esercizio4NumeroInteroPrecedente {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero pari o dispari");
        int N = Integer.parseInt(input);
        int succ = N+2;
        int prec = N-2;
        JOptionPane.showMessageDialog(null, "Il numero Successivo è: "+succ+ "\n"+
                "Il numero precedente è: "+ prec);
    }
}
