package edu.avogadro;

import javax.swing.*;

public class Matrice6 {
    public static void main(String[] args) {
        //Data una matrice calcolare la media di ogni riga e di ogni colonna ed inserirla in due vettori.
        //Analisi:
        //Letta la matrice[n][m], si crea un vettore sommaRiga[n] e sommaColonna[m]
        //si legge tutta la matrice e per ciascun elemento matrice[i][j] lo si somma sommaRiga[i] += matrice[i][j] e lo si somma anche in
        //sommaColonna[j] += matrice[i][j] una volta ottenute le somme si devono ovviamente dividere in questo modo: gli elementi che raccolgono
        //la somma per righe vanno divisi per il numero di colonne e gli elementi che raccolgono la somma per colonne vanno divisi per il numero di righe.
        //Alla fine si stampa la matrice e i due vettori contenenti le medie per riga e per colonne.
        //Conviene usare il tipo double per i numeri perchè effettuiamo delle medie.

        String output = "";
        double[][] matrice = new double[3][3];
        double[] sommaRiga = new double[matrice.length];
        double[] sommaColonna = new double[matrice[0].length];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = lettura("Inserire elemento N [" + i + "] [" + j + "]");
                output += String.format("%.2f", matrice[i][j]) + " ";
                sommaRiga[i] += matrice[i][j];
                sommaColonna[i] += matrice[i][j];
            }
            output += "\n";
        }

        for (int i = 0; i < sommaRiga.length; i++) {
            sommaRiga[i] /= matrice[i].length;
            output += String.format("%.2f",sommaRiga[i]+" ");
        }

        for (int j = 0; j < sommaColonna.length; j++) {
            sommaColonna[j] /= matrice[j].length;
            output += String.format("%.2f",sommaColonna[j]+" ");
        }
        JOptionPane.showMessageDialog(null, output);
    }








    public static int lettura(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
