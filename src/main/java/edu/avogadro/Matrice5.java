package edu.avogadro;

import javax.swing.*;

public class Matrice5 {
    public static void main(String[] args) {
        //data una matrice trasformarla in un unico vettore
        //Calcolare la dimensione della matrice ed allocare un array pari alla dimensione della matrice. Esplorare la matrice riga per riga e
        //memorizzare gli elementi nel vettore usando un contatore inizializzato a 0. Ogni volta che si passa ad un nuovo elemento si incrementa il contatore.
        //alla fine su stampa sia la matrice che gli elementi del vettore.


        String output = "";
        int [][] matrice = new int[2][2];
        int[] vettore =  new int[2*2];
        int cont = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire elemento N [" + i + "] [" + j + "]"));
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                vettore[cont] = matrice[i][j];
                cont++;
                output += matrice[i][j]+" ";
            }
            output += "\n";
        }
        for (int i = 0; i < vettore.length; i++) {
            output += vettore[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }


}
