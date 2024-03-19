package edu.avogadro;

import javax.swing.*;

public class Esercizio167Bis {
    public static void main(String[] args) {
        int [] v = leggiVettore();
        String outputPrima = stampaVettore(v);
        speculareVettore(v);
        String outputDopo = stampaVettore(v);
        JOptionPane.showMessageDialog(null,outputPrima+"\n"+outputDopo);
    }

    private static int[] leggiVettore() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci dimensione"));
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci v["+i+"]"));
        }
        return v;
    }
    private static void speculareVettore(int[] v) {
        for (int i = 0; i < v.length/2; i++) {
            scambia(v,i,v.length-i-1);
        }
    }

    private static String stampaVettore(int[] v) {
        String output = "";
        for (int i = 0; i < v.length; i++) {
            output += (output.equals("")?"":",")+v[i];
        }
        return output;
    }

    private static void scambia(int[] v, int i, int j) {
        int k = v[i];
        v[i] = v[j];
        v[j] = k;
    }
}