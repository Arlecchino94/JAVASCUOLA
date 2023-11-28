package edu.avogadro;

import javax.swing.*;

public class Esercizio72PotenzeDa1aP {
    public static void main(String[] args) {
        //Calcolare tutte le potenze da UNO a P di un numero N
        String input = JOptionPane.showInputDialog("Inserire potenza");
        double base = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire esponente");
        int esponente = Integer.parseInt(input);
        double potenza = 1;
        String output = "";
        for (int i = 1; i <= esponente; i++) {
            potenza = potenza * base;
            output += (output.equals("")?"":",")+potenza;
            /*
            L'espressione (output.equals("")?"":",") è un operatore ternario e significa che tale espressione
            può valere "" oppure ",", a seconda che il predicato prima del punto interrogativo valga vero o falso rispettivamente.
            Pertanto se output.equals("") è vero (cioè se output è uguale alla stringa vuota) allora l'intera espressione vale "".
            Se invece output.equals("") è falso (Cioè se output non è uguale alla stringa vuota) allora l'intera espressione
            vale ",".
             */
        }
        JOptionPane.showMessageDialog(null, output);


    }
}
