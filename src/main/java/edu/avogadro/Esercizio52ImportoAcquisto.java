package edu.avogadro;

import javax.swing.*;

public class Esercizio52ImportoAcquisto {
    public static void main(String[] args) {
        int importo = Integer.parseInt(JOptionPane.showInputDialog("Inserire il prezzo totale"));
        int sommapagata = Integer.parseInt(JOptionPane.showInputDialog("Inserire il totale pagato"));
        int t50 = Integer.parseInt(JOptionPane.showInputDialog("Inserire taglio da 50"));
        int t20 = Integer.parseInt(JOptionPane.showInputDialog("Inserire taglio da 20"));
        int t10 = Integer.parseInt(JOptionPane.showInputDialog("Inserire taglio da 10"));
        int t5 = Integer.parseInt(JOptionPane.showInputDialog("Inserire taglio da 5"));
        int t2 = Integer.parseInt(JOptionPane.showInputDialog("inserire taglio da 2"));
        int t1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire taglio da 1"));
        int resto = sommapagata - importo;
        int r50 = resto / 50;
        int restino;
        resto = resto % 50;
        if (r50 > t50) {
            restino = (r50 - t50) * 50;
            r50 = t50;
            resto = resto + restino;
        }
        int r20 = resto / 20;
        resto = resto % 20;
        if (r20 > t20) {
            restino = (r20 - t20) * 20;
            r20 = t20;
            resto = resto + restino;
        }
        int r10 = resto / 10;
        resto = resto % 10;
        if (r10 > t10) {
            restino = (r10 - t10) * 10;
            r10 = t10;
            resto = resto + restino;
        }
        int r5 = resto / 5;
        resto = resto % 5;
        if (r5 > t5) {
            restino = (r5 - t5) * 50;
            r5 = t5;
            resto = resto + restino;
        }
        int r2 = resto / 2;
        resto = resto % 2;
        if (r2 > t2) {
            restino = (r2 - t2) * 2;
            r2 = t2;
            resto = resto + restino;
        }
        int r1 = resto / 1;
        resto = resto % 1;
        if (r1 > t1) {
            restino = (r1 - t1) * 1;
            r1 = t1;
            resto = resto + restino;
        }
        JOptionPane.showMessageDialog(null, "Le banconote del resto sono: "+r50+"-"+r20+"-"+r10+"-"+r5+"-"+r2+"-"+r1);


    }
}
