package edu.avogadro;

import javax.swing.*;
import java.util.Arrays;

public class EsercitazioneTPSIprova2 {
    public static void main(String[] args) {
        //Dato un array di interi creare un array contentente solo i numeri perfetti del primo array

        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza array"));
        int[] v = new int[n];
        String output = "";
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
        int[] per = new int[n];
        per = perfetto(v,per);
        JOptionPane.showMessageDialog(null, Arrays.toString(per));

    }




    public static int[] perfetto(int[] v, int[] per){
            int somma = 0;
            int c = 0;
        for (int i = 0; i < v.length; i++) {
            somma = 0;
            for (int j = 1; j < v[i]; j++) {
                if (v[i] % j == 0) {
                    somma += j;
                }
            }
            if (somma == v[i]) {
                per[c] = somma;
                c++;
            }
        }
        return per;


    }
}
