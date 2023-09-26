package edu.avogadro;

import javax.swing.*;

public class Esercizio8SuddividereNumeri {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserire il valore A");
            int a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire il valore B");
            int b = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserire il valore C");
            int c = Integer.parseInt(input);
            int total = a + b + c;
            int aPercentage = (int) ((double) a / total * 100);
            int bPercentage = (int) ((double) b / total * 100);
            int cPercentage = (int) ((double) c / total * 100);

            System.out.println("La quantità totale è: " + total);
            System.out.println("Il valore di a è: " + aPercentage + "%");
            System.out.println("Il valore di b è: " + bPercentage + "%");
            System.out.println("Il valore di c è: " + cPercentage + "%");


    }
}
