package edu.avogadro;

import javax.swing.JOptionPane;
public class Esercizio119 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci n"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserisci m"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("Inserisci k"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l"));
        String output = "";
        for (int x = k; x <= l; x++) {
            double pot = Math.pow(x,m);
            String riga = "";
            for (int i = m; i <= n; i++) {
                riga += (riga.equals("")?"":",") + pot;
                pot *= x;
            }
            output += (output.equals("")?"":"\n") + riga;
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

