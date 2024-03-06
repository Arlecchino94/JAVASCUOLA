package edu.avogadro;

import javax.swing.*;

public class TPSI2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        int sommaDivisori = 0;
        String output = "";
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sommaDivisori += i;
            }
        }

        if (sommaDivisori == numero) {
            output += numero+" è un numero perfetto";
        } else {
            output += numero + " non è un numero perfetto.";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
