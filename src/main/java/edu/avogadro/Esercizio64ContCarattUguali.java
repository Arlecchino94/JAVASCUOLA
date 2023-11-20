package edu.avogadro;

import javax.swing.*;

public class Esercizio64ContCarattUguali {
    public static void main(String[] args) {
        //conta coppie di lettere
        String input = JOptionPane.showInputDialog("Inserire dei caratteri");
        String prec= "";
        int idx = 0;
        int contCopie = 0;
        char c;
        while (idx < input.length()) {
            c = input.charAt(idx);
            if (prec.equals(c+"")) {
                contCopie++;
                prec = "";
            }else {
                prec = ""+c;
            }
            idx++;
        }
        String output = "Ci sono "+contCopie+" coppie";
        JOptionPane.showMessageDialog(null, output);
    }
}
