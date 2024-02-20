package edu.avogadro;

import javax.swing.*;

public class Esercizio110tris {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri pari devo stampare"));
        int num = 1;
        int contPerf = 0;
        String output = "";
        while (contPerf < n) {
            int somma = 0;
            for (int i = 1; i < num-1;i++){
                if (num % i == 0){
                    somma += i;
                }

            }
            if (num == somma){
                output += (output.equals("")?"":",")+num;
                contPerf++;
            }
            num++;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
