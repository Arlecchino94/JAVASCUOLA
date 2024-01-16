package edu.avogadro;

import javax.swing.*;

public class Esercizio91 {
    public static void main(String[] args) {
        // Trovare la radice quadrata di un numero N. Cioè il più grande numero intero K per cui K^2 <= N

                int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero positivo: "));
                int k = 1;
                while (k * k <= n) {
                    k++;
                }
                k--;
                JOptionPane.showMessageDialog(null, "La radice quadrata di " + n + " è " + k);
            }
        }

