package edu.avogadro;

import javax.swing.*;

public class Esercizio250 {
    public static void main(String[] args) {
        /*Leggere un vettore di N elementi e disporre i dati in una matrice di M righe procedendo per righe e lasciando vuoti
        gli elementi eventualmente inutilizzati della matrice; calcolare il numero di colonne necessarie.
        Esempio:
        vettore di 80 elementi in una matrice di 10 elementi per riga
        Quante colonne avrà? ne avrà 80 / 10=8, se fosse stati 81 elementi allora arrotonda a quello successivo che ne avrà 9
        C = round(N/M) --> se M divide esattamente N allora C = N/M, altrimenti C = N/M + 1
        double[] vett = new double[N]
        double[][] matrice = new double[M][C]
        Per memorizzare il vett dentro la matrice basta usare due cicli for annidati e usare un contatore per il vettore
        k = 0;
        for (int i = 0; i < matrice.length;i++){
           fori(int j = 0; j < matrice[i].length & k < v.length; j++){
               matrice[i][j] = vet[k];
               k++;
               }
           }
         */
        String output = "";
        double[] vettore = new double[Integer.parseInt(JOptionPane.showInputDialog("Inserire elementi"))];
        for (int i = 0; i <vettore.length; i++) {
            vettore[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire numero"));
        }
        int c;
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ins num righe"));
        if (vettore.length % m == 0){
            c = vettore.length / m;
        }else {
            c = vettore.length / m +1;
        }
        double[][] matrice = new double[m][c];
        int k = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length && k < vettore.length; j++) {
                matrice[i][j] = vettore[k];
                k++;
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                output += matrice[i][j] + " ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);





    }
}
