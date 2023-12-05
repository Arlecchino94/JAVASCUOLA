package edu.avogadro;

import javax.swing.JOptionPane;

/**
 *
 * @author micro
 */
public class esercizio76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mcm di due numeri a e b
        /*
        confrontare i due valori e sommare quello più piccolo a se stesso,
        confrontare la somma ottenuta con l'altro valore, e contunuare a sommare quello più piccolo a se stesso
        */
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int somA = a;
        int somB = b;
        while (somA != somB) {
            if (somA < somB) {
                somA += a;
            } else {
                somB += b;
            }
        }
        JOptionPane.showMessageDialog(null,somA);
    }
    
}
