package edu.avogadro;

import javax.swing.*;

public class Esercizio254 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire dimensione matrice"));
        int[][]m = new int[n][n];
        String output = "";
        int cont = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = cont;
                cont++;
                output += String.format("%3d", m[i][j]) + " ";
            }
            output += "\n";
        }
        int r=m.length-1;
        int c=m.length-1;
        int lung = 1;
        int k = 1;
        boolean superato = false;
        for (int i = 0; i < m.length*m.length; i++) {
            System.out.println(r+","+c+","+lung);
            output += String.format("%3d", m[r][c]) + " ";
            if (k < lung) {
                r--;
                c++;
                k++;
            } else {
                k = 1;
                if (lung < m.length && !superato) {
                    r = m.length-1;
                    c -= lung;
                    lung++;
                } else {
                    superato = true;
                    lung--;
                    r = lung-1;
                    c = 0;
                }
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}