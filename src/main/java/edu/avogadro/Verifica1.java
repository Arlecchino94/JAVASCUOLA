package edu.avogadro;

import javax.swing.*;

public class Verifica1 {
    public static void main(String[] args) {
        //1) dato un array di elementi interi A, creare un secondo array B uguale ad A però privo di elementi duplicati di A e memorizzati nello stesso ordine di A. (3)
        //A = {1,2,2,5,3,1,2,8}
        //B = {1,2,5,3,8}

        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        int[] A = new int[n];
        int[] B = new int[A.length];
        String output = "";

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        }

        int j = 0;

            for (int i = 0; i < A.length; i++) {
                    int k = 0;
                    while (k < j && A[i] != B[k]) {
                        k++;
                    }
                    if (k == j) {
                        B[j++] = A[i];
                    }
                }

                // Stampa l'array B
                for (int i = 0; i < j; i++) {
                    output += B[i] + " ";
                }
        JOptionPane.showMessageDialog(null, output);
            }

        }


