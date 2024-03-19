package edu.avogadro;

import javax.swing.*;

public class Esercizio171 {
    public static void main(String[] args) {
        //Shiftare di Q posizioni un vettore, usando un vettore di Q componenti come salvataggio
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci dim vettore"));
        int q = Integer.parseInt(JOptionPane.showInputDialog("Inserisci spostamenti"));
        int [] v = new int[n];
        int [] s = new int[q];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("v["+i+"]"));
        }
        String output1 = stampaVettore(v);
        for (int i = 0; i < q; i++) {
            s[i] = v[i];
        }
        int i = q;
        for (; i < n-q; i+=q) {
            for (int j = 0; j < q; j++) {
                int salva = v[j+i];
                v[j+i] = s[j];
                s[j] = salva;
            }
        }
        System.out.println("valore i = "+i);
        int k = 0;
        for (int j = i; j < n; j++) {
            v[j] = s[k];
            k++;
        }

        for (i = 0; i < q; i++) {
            v[i] = 0;
        }
        String output2 = stampaVettore(v);
        JOptionPane.showMessageDialog(null,output1+"\n"+output2);
    }

    private static String stampaVettore(int[] v) {
        String output = "";
        for (int i = 0; i < v.length; i++) {
            output += (output.equals("")?"":",")+v[i];
        }
        return output;
    }

}