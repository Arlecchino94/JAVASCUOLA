package edu.avogadro;

import javax.swing.*;

public class Esercizio66Espresisone {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire espressione");
        int expr = 0;
        char op = '+';
        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int n = c - '0';
                switch (op) {
                    case '+' : expr += n; break;
                    case '-' : expr -= n; break;
                    case '*' : expr *= n; break;
                    case '/' : expr /= n; break;
                }
        }else {
                op = c;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "il risultato è: "+expr);


    }
}