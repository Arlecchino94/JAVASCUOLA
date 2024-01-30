package edu.avogadro;

import javax.swing.*;

public class Esercizio93 {
    public static void main(String[] args) {

        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il grado minimo: "));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il grado massimo: "));
        int grado = 1;
        int fib1 = 0;
        if (grado <= n) {
            if (grado >= m) {
                JOptionPane.showMessageDialog(null, fib1);
            }
            grado++;
            int fib2 = 1;
            while (grado <= n) {
                if (grado >= m) {
                    JOptionPane.showMessageDialog(null,fib2);
                }
                grado++;
                int fib2old = fib2;
                fib2 = fib1+fib2;
                fib1 = fib2old;


            }
        }
            }
        }
