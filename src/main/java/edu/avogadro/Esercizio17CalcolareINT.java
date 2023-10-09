package edu.avogadro;

import javax.swing.*;

public class Esercizio17CalcolareINT {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserire il valore M"));
        double nArr = Math.floor(n*Math.pow(10,m)+0.5)/Math.pow(10,m);
        String fmt = "n = %f\nnArr"
        String output = String.format("n = %f\nnArr = "+fmt, n, nArr);
        JOptionPane.showMessageDialog(null, output);
    }
}
