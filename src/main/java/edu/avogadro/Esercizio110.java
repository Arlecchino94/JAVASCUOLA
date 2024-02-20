package edu.avogadro;

import javax.swing.*;

public class Esercizio110 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanti numeri pari devo stampare"));
        int num = 1;
        int contPari = 0;
        String output = "";
        while (contPari < n) {
            if (num % 2 == 0){
                output += (output.equals("")?"":",")+num;
                contPari++;
            }
            num++;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
