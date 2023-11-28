package edu.avogadro;

import javax.swing.*;

public class Esercizio72PotenzeDa1aP {
    public static void main(String[] args) {
        //Calcolare tutte le potenze da 1 a P di un numero N
        String input = JOptionPane.showInputDialog("Inserire potenza");
        double base = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire esponente");
        int esponente = Integer.parseInt(input);
        double potenza = 1;
        String output = "";
        for (int i = 1; i <= esponente; i++) {
            potenza = potenza * base;
            output += (output.equals("")?"":",")+potenza;
        }
        JOptionPane.showMessageDialog(null, output);


    }
}
