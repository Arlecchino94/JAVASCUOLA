package edu.avogadro;

import javax.swing.*;

public class TPSI44 {
    public static void main(String[] args) {
        //4.Trova il più grande numero primo inferiore a un dato numero N.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire n"));
        int d = 0;
        int p = 0;
        for (int i = 2; i < n; i++) {
            d = 0;
            for (int j = 1; j <= i; j++) {
                if ( i % j == 0 ){
                    d++;
                }
            }
            if ( d == 2 ){
                p = i;
            }
        }
        JOptionPane.showMessageDialog(null,"Il più grande primo minore di "+n+" è: "+p);

    }
}