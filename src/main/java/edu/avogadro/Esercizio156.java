package edu.avogadro;

import javax.swing.*;

public class Esercizio156 {
    public static void main(String[] args) {
        // dato un vettore di caratteri che contiene un espressione con sole parentesi () dire se le parentesi sono corrette
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire lunghezza vettore"));
        char[] v = new char[n];
        String output = "";
        String input = "";
        int cont = 0;
        for (int i = 0; i < n; i++) {
            input = JOptionPane.showInputDialog("Inserire tonde");
            v[i] = input.charAt(0);
            if (v[i] == '(') {
                cont++;
            }
            if (v[i] == ')') {
                cont--;
            }
            if (cont < 0){
                break;
            }
        }
        if (cont == 0) {
            output += "Le parentesi sono corrette";
        } else {
            output += "Le parentesi non sono corrette";
        }
        JOptionPane.showMessageDialog(null,output);
    }

}