package edu.avogadro;

import javax.swing.*;

public class Esercizio169 {
    public static void main(String[] args) {
        //generare tutti e soli i numeri inferiori a N che sono una palindrome
        //(generate i numeri e per ognuno mettere le cifre in un vettore
        //e controllare se è un palindromo)
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire array"));
        String output = "";
        for (int i = 0; i <= n; i++) {
            if (palindromo(i)) {
                output += (output.equals("")?"":",")+i;
            }
        }
        JOptionPane.showMessageDialog(null, output);

    }
    public static boolean palindromo(int m) {
        int n = m;
        int cifre = 0;
        while (n != 0) {
            n = n / 10;
            cifre++;
        }
        int v[] = new int[cifre];
        n = m;
        cifre = 0;
        while (n != 0) {
            v[cifre] = n % 10;
            n = n / 10;
            cifre++;
        }
        boolean palind = true;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != v[v.length-1-i]){
                palind = false;
                break;
            }
        }
        return palind;
    }
}
