package edu.avogadro;


import javax.swing.*;

public class Esercizio152 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettori"));
        int[] primo = new int[n];
        int[] secondo = new int[n];
        int[] risultato = new int [n];
        String outputv1 = "";
        String outputv2 = "";
        String outputv3 = "";
        for (int i = 0; i < n; i++) {
            primo[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire " + (i+1)+" elemento del primo vettore"));
            secondo[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire "+ (i+1)+" elemento del secondo vettore"));
            risultato[i] = primo[i]-secondo[i];
            outputv1 += (outputv1.equals("")?"":",")+primo[i];
            outputv2 +=(outputv2.equals("")?"":",")+secondo[i];
            outputv3 += risultato[i]+" ";

        }
        JOptionPane.showMessageDialog(null, "{"+outputv1+"}\n"+"{"+outputv2+"}\n"+"{"+outputv3+"}");
    }
}
