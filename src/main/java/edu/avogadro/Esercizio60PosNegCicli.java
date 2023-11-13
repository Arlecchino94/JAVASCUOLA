package edu.avogadro;

import javax.swing.*;

public class Esercizio60PosNegCicli {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire un numero");
        int contPos = 0;
        int contNeg = 0;
        while (!input.equals("")) {
            int n = Integer.parseInt(input);
            if (n >= 0 ) {
                contPos++;
            }else {
                contNeg++;
            }
            input = JOptionPane.showInputDialog("Inserire un numero");
        }
        JOptionPane.showMessageDialog(null, "I numeri positivi sono: "+contPos+"\n"+
                "I numeri negativi sono: "+contNeg);

    }
}
