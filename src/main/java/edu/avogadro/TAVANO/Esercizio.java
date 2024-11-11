package edu.avogadro.TAVANO;

import javax.swing.*;

public class Esercizio {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Inserire numero binario 1");
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != '0' && n1.charAt(i) != '1') {
                break;
            }
        }
        String n2 = JOptionPane.showInputDialog("Inserire numero binario 2");
        for (int i = 0; i < n2.length(); i++) {
            if (n2.charAt(i) != '0' && n2.charAt(i) != '1') {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, sommaBinario(n1, n2));
    }


    public static String sommaBinario(String n1, String n2) {
        String somma = "";
        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                if (n1.charAt(i) == '1' && n2.charAt(j) == '0') {
                    somma = '1' +somma;
                } else if (n1.charAt(i) == '0' && n2.charAt(j) == '1') {
                    somma = '1'+somma;
                } else if (n1.charAt(i) == '0' && n2.charAt(j) == '0') {
                    somma = '0'+somma;
                }else if (n1.charAt(i) == '1' && n2.charAt(j) == '1'){

                }
            }
        }
        return somma;
    }
}
