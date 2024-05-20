package edu.avogadro;

import javax.swing.*;

public class Esercizio252 {
    public static void main(String[] args) {
        //Data una matrice quadrata, dire se la somma degli elementi della diagonale principale è maggiore della somma degli elementi della diagonale secondaria
        //Si individuano e si sommano gli elementi delle due diagonali e poi si confrontano le somme (vedi analisi esercizio 251)

        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire dimensione matrice quadrata"));
        int[][] matrice = new int[n][n];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore"));
            }
        }
        String output1 = "";
        String output2= "";
        int sommaDiagD = 0;
        int sommaDiagS = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    output1 += matrice[i][j] + " ";
                    sommaDiagS = matrice[i][j];
                }
                if (i + j == matrice.length -1){
                    output2 += matrice[i][j] + " ";
                    sommaDiagD = matrice[i][j];
                }
            }
        }

        JOptionPane.showMessageDialog(null, "La somma della diagonale sinistra è: "+sommaDiagS + "\n" +
                "La somma della diagonale destra è : " + sommaDiagD);
    }
}
