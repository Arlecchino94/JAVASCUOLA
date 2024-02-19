package edu.avogadro;

import javax.swing.*;

public class Esercizi109 {
    // Calcolare i primi N numeri Primi
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri primi si vogliono visualizzare"));
        int num = 2;
        int contPrimi = 0;
        while (contPrimi < n){
            int contDiv = 0;
            for (int i = 1;i <= num;i++) {
                if (num % i == 0) {
                    contDiv = contDiv + 1;
                }
            }
            if (contDiv == 2){
                JOptionPane.showMessageDialog(null, num);
                contPrimi = contPrimi + 1;
            }
            num = num +1;
        }
    }
}
