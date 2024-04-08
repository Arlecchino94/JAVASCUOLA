package edu.avogadro;

import javax.swing.*;

public class Verifica1 {
    public static void main(String[] args) {
        //1) dato un array di elementi interi A, creare un secondo array B uguale ad A però privo di elementi duplicati di A e memorizzati nello stesso ordine di A. (3)
        //A = {1,2,2,5,3,1,2,8}
        //B = {1,2,5,3,8}

        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        int[] v = new int[n];
        int[] m = new int[v.length];
        int j = 0;
        String output = "";

        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }

        for (int i = 0; i < n; i++) {
            while (v[i] != v[i+1]){
                m[i] = v[i+1];
                output += m[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}


