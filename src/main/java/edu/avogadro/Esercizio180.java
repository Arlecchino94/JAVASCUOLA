package edu.avogadro;

import javax.swing.*;

public class Esercizio180 {
    public static void main(String[] args) {
        //Data una serie di temperature, calcolare la frequenza negli intervalli <= -10, -9/0 1/10 11/20 21/30 31/40 >= 41
        String output = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza"));
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
        }
        int[] classe = new int[7];
        for (int i = 0; i < n; i++) {
            int x = temp[i];
            if (x <= -10){
                classe[0]++;
            }else
                if (x < 41){
                classe[(x+19)/10]++;
            }else {
                classe[6]++;
            }
        }
        for (int i = 0; i < 6; i++) {
            output += classe[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
