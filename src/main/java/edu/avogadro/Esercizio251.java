package edu.avogadro;

import javax.swing.*;

public class Esercizio251 {
    public static void main(String[] args) {
        //Data una matrice quadrata visualizzare gli elementi della diagonale principale e secondaria
        //   0 1 2 3 4 5
        /* 0 X         Y
           1   X     Y
           2     XY
           3     YX
           4   Y     X
           5 Y        X
           Gli elementi della diagonale principale di una matrice quadrata hanno la seguente caratteristica: (0,0) (1,1) (2,2) (3,3) (4,4) (5,5)
           ovvero il numero di riga è uguale al numero di colonna
           Gli elementi della diagonale secondaria di una matrice quadrata hanno la seguente caratteristica: (5,0) 41,1) (3,2) (2,3) (1,4) (0,5)
           ovvero il numero di riga e del numero di colonna è uguale al numero di righe +1.
           Si puo fare un unico ciclo da 0 a 5 e quindi usare la variabile di ciclo i per accedere all'elemento della diagonale principale : (i,i)
           mentre quello della diagonale secondaria è: (5-1,i)
         */
        String output1 = "";
        String output2 = "";
        int r = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero righe"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero colonne"));
        int[][] matrice = new int[r][c];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserire valore "+j+" della riga "+c));
            }


            /*
            String outPrincipale = "";
            String outSecondario = "";
            for(int i = 0;
             */

        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    output1 += matrice[i][j] + " ";
                }
                if (i + j == matrice.length -1){
                    output2 += matrice[i][j] + " ";
                }
            }
        }
        JOptionPane.showMessageDialog(null,output1 + "\n" + output2);



    }
}
