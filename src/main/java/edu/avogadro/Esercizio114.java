package edu.avogadro;


import javax.swing.*;

public class Esercizio114 {
    public static void main(String[] args) {
        //Dato un numero, scomporlo in fattori primi
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int fatt = 1;
        int cont = 2;
        String output = "";
        while ( n > fatt) {

            if (n % cont == 0) {
                n /= cont;
                output += (output.equals("")?"":" * ")+cont;
            }else {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
