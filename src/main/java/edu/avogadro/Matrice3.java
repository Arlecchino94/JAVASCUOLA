package edu.avogadro;

import javax.swing.*;

public class Matrice3 {
    public static void main(String[] args) {
        String output = "";

        int [] [] matrice = new int[3][2];
        int somma = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire elemento N ["+i+"] ["+j+"]"));
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                output += matrice[i][j]+" ";
                somma += matrice[i][j];
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output+"\n"+somma);
    }
}


