package edu.avogadro;

import javax.swing.*;

public class Esercizio167Bis {
    public static void main(String[] args) {

        int[] v = leggiVettore();
        String outputPrima = stampaVettore(v);
        speculareVettore(v);
        String outputDopo = stampaVettore(v);
        JOptionPane.showMessageDialog(null, outputPrima + "\n" + outputDopo);
    }

    public static int[] leggiVettore() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Lunghezza vettore"));
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
        return v;
    }

    public static void speculareVettore(int[] v) {
        for (int i = 0; i < v.length/2; i++) {
            scambia(v,i,v.length-i-1);
        }

    }

    public static String stampaVettore(int[] v) {
        String output = "";
        for (int i = 0; i < v.length; i++) {
            output += (output.equals("")?"":",");
        }
    }

    public static void scambia(int[] v) {

    }
}
