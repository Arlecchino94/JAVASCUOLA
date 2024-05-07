package edu.avogadro;

import edu.avogadro.funzioni.Lettura;

import javax.swing.*;

public class Matrice7 {
    public static void main(String[] args) {
        //Data una matrice costruire due vettori. uno con gli elementi superiori alla media e uno con gli elementi inferiori alla media
        //analisi:
        //Calcolo la media della matrice sommando tutti gli elementi e dividendo per numeroRighexnumeroColonne.
        //Dobbiamo poi esplorare tutta la matrice contando gli elementi inferiori contInf e superiori contSup
        //Creiamo due vettori inf e sup la cui dimensione è rispettivamente contInf e contSup
        //Riesploriamo la matrice usando contInf e contSup. Se l'elemento m[i][j] è minore della media lo memorizziamo in inf[contInf]
        //e incrementiamo contInf. Se l'elemento m[i][j] è superiore alla media lo memorizziamo in sup[contSup] e incrementiamo contSup.
        //Al termine stampiamo la matrice e i due vettori.

        String output = "";
        double[][] matrice = new double[3][3];
        double somma = 0;
        double media = 0;
        output += "Matrice: ";
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = Lettura.lettura("Inserire elemento N [" + i + "] [" + j + "]");
                somma += matrice[i][j];
                output += matrice[i][j] +" ";
            }
            output += "\n";
        }
        media = somma / (matrice.length*matrice[0].length);
        int sup = 0;
        int inf = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] < media){
                    inf++;
                }
                if (matrice[i][j] > media){
                    sup++;
                }
            }
        }
        double[] vinf = new double[inf];
        double[] vsup = new double[sup];
        sup = 0;
        inf = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] < media){
                    vinf[inf] = matrice[i][j];
                    inf++;
                }
                if (matrice[i][j] > media) {
                    vsup[sup] = matrice[i][j];
                    sup++;
                }
            }
        }
        output += "Elementi superiori: ";
        for (int i = 0; i < vsup.length; i++) {
            output += vsup[i] + " ";
        }
        output += "\n";
        output += "Elementi inferiori: ";

        for (int i = 0; i <vinf.length ; i++) {
            output +=  vinf[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
