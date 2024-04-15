package edu.avogadro;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class EsercitazioneTPSIdiProva {
    public static void main(String[] args) {
        //Dato un array di interi creare due array, uno con gli elementi positivi e uno con gli elementi negativi
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza array"));
        int[] v = new int[n];
        String output1 = "";
        String output2 = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }

        int[] p = new int[n];
        int[] neg = new int[n];
        int pos = 0;
        int negg = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] < 0) {
                neg[negg] = v[i];
                output1 += neg[negg]+" ";
                negg++;
            } else {
                p[pos] = v[i];
                output2 += p[pos] + " ";
                pos++;
            }
        }

        JOptionPane.showMessageDialog(null, output1 + "\n" + output2);
    }
}
